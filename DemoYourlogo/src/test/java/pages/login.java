package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Screenshot;

public class login
{
	WebDriver driver;
	WebElement signin,email,password,clicksign;
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnSignIn() throws Exception
	{
		signin=driver.findElement(By.linkText("Sign in"));
		//Screenshot.captureScreenshot();
		signin.click();
	}
	public void login1(String s1,String s2) throws InterruptedException
	{
		email=driver.findElement(By.id("email"));
		email.sendKeys(s1);
		password=driver.findElement(By.id("passwd"));
		password.sendKeys(s2);
		clicksign=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		clicksign.click();
		Thread.sleep(10000);
		
	}

}
