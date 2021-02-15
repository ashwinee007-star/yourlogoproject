package testcases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.cart;
import pages.login;

public class tc4_Cart {
	WebDriver driver;
	@Given("^the product should be in stock$")
	public void the_product_should_be_in_stock() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(10000);
	}

	@When("^the user wishes to buy the product$")
	public void the_user_wishes_to_buy_the_product() throws Throwable {
		Thread.sleep(10000);
		login obj=new login(driver);
	    obj.clickOnSignIn();
	    obj.login1("pooja@gmail.com", "pooja123.");
	    cart obj1=new cart(driver);
	    obj1.addProductToCart();
	    
	}

	@Then("^user adds the product to cart$")
	public void user_adds_the_product_to_cart() throws Throwable {
	    Thread.sleep(5000);
	    driver.quit();
	}

	@Given("^the product should be in cart$")
	public void the_product_should_be_in_cart() throws Throwable {
	    
	}

	@When("^user wants to checkout the products in cart$")
	public void user_wants_to_checkout_the_products_in_cart() throws Throwable {
	   
	}

	@Then("^user makes payment and checks out$")
	public void user_makes_payment_and_checks_out() throws Throwable {
	   
	}
}
