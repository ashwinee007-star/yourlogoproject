package testcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.createaccount;

public class tc3_createaccount 
{
	WebDriver driver;
	@Given("^the user is in the create account page$")
	public void the_user_is_in_the_create_account_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	    
	}

	@When("^the user wants to register his credentials$")
	public void the_user_wants_to_register_his_credentials() throws Throwable {
	    createaccount obj=new createaccount(driver);
	    obj.clickOnSignIn();
	    Random randomGenerator = new Random();  
	    int randomInt = randomGenerator.nextInt(1000);  
	    obj.email("username"+ randomInt +"@gmail.com");
	   
	    obj.register("pooja Kumar", "Sahoo", "pooja123.","Mphasis","Balaji", "P nagar","Tumkur","32004","9656565");
	}

	@Then("^he registers and log in$")
	public void he_registers_and_log_in() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	    
	}
}
