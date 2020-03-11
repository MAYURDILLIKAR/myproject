package practice;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		  Thread.sleep(10000);
		   
		  WebElement From=driver.findElement(By.xpath("//input[contains(@id,'FromTag')]"));
		  
		  From.clear();
		  Thread.sleep(5000);
		  From.sendKeys("hyderabad");
		  From.click();
		  WebElement Date=driver.findElement(By.xpath("//input[contains(@id,'DepartDate')]"));
		  Date.clear();
		  Thread.sleep(3000);
		  	Date.sendKeys("Fri, 28 Feb, 2020");
		  	Date.sendKeys(Keys.TAB);
	}

}
