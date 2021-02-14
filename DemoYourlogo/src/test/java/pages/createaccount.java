package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createaccount 
{
	WebDriver driver;
	WebElement username,password,signin,email,creacc,firstname,lastname,psswd;
	List<WebElement> title;
	public createaccount(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnSignIn()
	{
		signin=driver.findElement(By.linkText("Sign in"));
		signin.click();
	}
	public void email(String s) throws InterruptedException
	{
		email=driver.findElement(By.id("email_create"));
		email.sendKeys(s);
		creacc=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		creacc.click();
		Thread.sleep(10000);
	}
	public void register(String n1,String n2,String ps,String com,String add, String add1,String city1,String code1,String mobile1) throws InterruptedException
	{
		Thread.sleep(5000);
		title=driver.findElements(By.name("id_gender"));
		title.get(0).click();
		firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys(n1);
		lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys(n2);
		psswd=driver.findElement(By.name("passwd"));
		psswd.sendKeys(ps);
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("5");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByIndex(11);
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1994");
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys(com);
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys(add);
		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys(add1);
	   Select state = new Select(driver.findElement(By.id("id_state")));
	   state.selectByValue("9");
	   WebElement city=driver.findElement(By.id("city"));
	   city.sendKeys(city1);
	   WebElement code=driver.findElement(By.id("postcode"));
	   code.sendKeys(code1);
	   WebElement mobile=driver.findElement(By.id("phone_mobile"));
	   mobile.sendKeys(mobile1);
	   WebElement clcreg=driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
	   clcreg.click();
	}
}
