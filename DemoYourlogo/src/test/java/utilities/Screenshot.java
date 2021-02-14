package utilities;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Screenshot {
	static int i = 1;
    static WebDriver driver;
  
    public void test() throws Exception 
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);
        captureScreenshot();
       WebElement signin=driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement email=driver.findElement(By.id("email_create"));
		email.sendKeys("Anu@gmail.com");
		WebElement creacc=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		creacc.click();
		Thread.sleep(2000);
		captureScreenshot();
		List<WebElement> title=driver.findElements(By.name("id_gender"));
		title.get(0).click();
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Anu");
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("Gautam");
		WebElement psswd = driver.findElement(By.name("passwd"));
		psswd.sendKeys("Anu@2013");
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("5");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByIndex(11);
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1994");
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("com");
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("add");
		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("add1");
	   Select state = new Select(driver.findElement(By.id("id_state")));
	   state.selectByValue("9");
	   WebElement city=driver.findElement(By.id("city"));
	   city.sendKeys("city1");
	   WebElement code=driver.findElement(By.id("postcode"));
	   code.sendKeys("32007");
	   WebElement mobile=driver.findElement(By.id("phone_mobile"));
	   mobile.sendKeys("7247439923");
	   WebElement clcreg=driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
	   clcreg.click();
	   Thread.sleep(2000);
	   captureScreenshot();
	   email=driver.findElement(By.id("email"));
		email.sendKeys("Anu@hello.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Anu@2013");
		WebElement clicksign = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		clicksign.click();
		Thread.sleep(10000);
		captureScreenshot();
		WebElement women=driver.findElement(By.linkText("WOMEN"));
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		tshirt.click();
		Thread.sleep(2000);
		WebElement fad = driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
		action.moveToElement(fad).build().perform();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(3000);
		WebElement proceed1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed1.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed2.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement proceed3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		proceed3.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement tos = driver.findElement(By.id("uniform-cgv"));
		tos.click();
		WebElement proceed4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		proceed4.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span"));
		pay.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		confirm.click();
		Thread.sleep(2000);
		captureScreenshot();
		WebElement signout = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		signout.click();
		Thread.sleep(2000);
		captureScreenshot();
        driver.quit();
        
    }
    static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("D://Project Test steps//step" + i + ".jpeg"));
        
        i++;
    }
}
