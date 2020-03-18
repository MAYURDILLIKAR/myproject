     package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchBrowser
{
	//. method start
	
	
	public static void main(String[] args) throws Exception
{	
	System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	
	driver.findElements(By.name("firstname")).clear();
	driver.findElement(By.name("firstname")).sendKeys("sanjay");
	Thread.sleep(5000);
	driver.findElement(By.name("lastname")).clear();
	driver.findElement(By.name("lastname")).sendKeys("Dilliker");
	Thread.sleep(5000);
	driver.findElement(By.name("reg_email__")).clear();
	driver.findElement(By.name("reg_email__")).sendKeys("sanjaydilliker@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.name("reg_email_confirmation__")).clear();
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sanjaydilliker@gmail.com");
	driver.findElement(By.id("u_0_w")).clear();
	driver.findElement(By.id("u_0_w")).sendKeys("9246525648");
	
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
	
	
	Select select = new Select(day);
	select.selectByVisibleText("26");
	

	Select select1 = new Select(month);
	select1.selectByVisibleText("Jun");

		
	Select select2 = new Select(year);
	select2.selectByVisibleText("1964");
	
	
	
	driver.findElement(By.id("u_0_7")).click(); 
	driver.findElement(By.xpath("//button[contains(@id,'u_0_13')])"));
	
	
	
	
	
	
		
	
	

}
}

