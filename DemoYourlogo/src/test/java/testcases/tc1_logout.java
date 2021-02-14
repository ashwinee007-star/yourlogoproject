package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;
import pages.logout;
import utilities.Screenshot;

public class tc1_logout 
{
	WebDriver driver;
	@Given("^the user has successfully checkedout the product$")
	public void the_user_has_successfully_checkedout_the_product() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");  
	}

	@When("^the user wants to log-out$")
	public void the_user_wants_to_log_out() throws Throwable {
		login obj=new login(driver);
	    obj.clickOnSignIn();
	    obj.login1("pooja@gmail.com", "pooja123.");
	    Thread.sleep(3000);
	    logout obj1=new logout(driver);
	    obj1.clickOnSignout();
	    Screenshot obj11=new Screenshot();
	    obj11.test();
	}

	@Then("^the user logged out successfully$")
	public void the_user_logged_out_successfully() throws Throwable 
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
