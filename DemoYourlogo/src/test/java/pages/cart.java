package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class cart 
{
	static int i = 1;
    static WebDriver driver;
	WebElement Cart,women,tshirt,fad,addtocart,proceed1,proceed2,proceed3,proceed4,tos,pay,confirm;
	public cart(WebDriver driver)
	{
		this.driver=driver;
	}
	public void addProductToCart() throws Exception
	{
		women=driver.findElement(By.linkText("WOMEN"));
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();
		Thread.sleep(2000);
		
		tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		tshirt.click();
		
		Thread.sleep(2000);
		
		fad=driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
		action.moveToElement(fad).build().perform();
		addtocart=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(10000);
		proceed1=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed1.click();
		proceed2=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed2.click();
		proceed3=driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		proceed3.click();
		tos=driver.findElement(By.id("uniform-cgv"));
		tos.click();
		proceed4=driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		proceed4.click();
		pay=driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span"));
		pay.click();
		confirm=driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		confirm.click();
	}
}
