package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implict_Syntax_Wait {

	public static void main(String[] args) 
	{
		String chrome_path="browser_brivers\\chromedriver.exe";
		Object chromedriver;
		Object browser_drivers;
		String setProperty = System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("Automated");
		WebElement Next=driver.findElement(By.id("identifierNext"));
		Next.click();
		System.out.println("timeout released facebook id presented");
		
		
	
	}

}
