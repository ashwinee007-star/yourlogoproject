package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;

public class tc2_login 
{
	WebDriver driver;
	@Given("^the user has created account in the website$")
	public void the_user_has_created_account_in_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^the user wants to login$")
	public void the_user_wants_to_login() throws Throwable {
	    login obj=new login(driver);
	    obj.clickOnSignIn();
	    obj.login1("pooja@gmail.com", "pooja123.");
	}

	@Then("^the user logs in to the website$")
	public void the_user_logs_in_to_the_website() throws Throwable {
	  
		Thread.sleep(5000);
		driver.quit();
	}

	@Given("^the user has not created his account in the website$")
	public void the_user_has_not_created_his_account_in_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	    
	}

	@When("^the user want to login$")
	public void the_user_want_to_login() throws Throwable {
		login obj=new login(driver);
		obj.clickOnSignIn();
	    obj.login1("poja@gmail.com", "pooja23.");
	    
	}

	@Then("^the user unable log in to the website$")
	public void the_user_unable_log_in_to_the_website() throws Throwable {
		
		  
	}
}
