package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeen_Capture 
{

	public static void main(String[] args)
	{
		/*
		 * locate crome browzer in your system.
		 * 
		 */ 
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.firstnaukri.com/");  
		driver.manage().window().maximize(); 
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


	}

}
