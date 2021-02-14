package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout 
{
	WebDriver driver;
	WebElement signout;
	public logout(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnSignout()
	{
		signout=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		signout.click();
	}
}
