package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip   /// classs name 
{
	public static void main(String[] args) throws InterruptedException  /// method 
	
	{ 
		
System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver2.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://cleartrip.com");
driver.manage().window().maximize();
Thread.sleep(10000);
 driver.switchTo().alert().accept();

WebElement Round=driver.findElement(By.xpath("//input[@id='RoundTrip']"));

Round.clear(); 
Round.sendKeys("Hyderabad");


WebElement From=driver.findElement(By.id("FromTag"));
From.clear();
From.sendKeys("Nainital");
WebElement To=driver.findElement(By.id("ToTag"));
To.clear();
To.sendKeys("Dehradhun");
Round.getText();



}
}