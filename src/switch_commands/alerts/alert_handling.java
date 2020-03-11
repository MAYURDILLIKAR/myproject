package switch_commands.alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  //Launch browser
		driver.get("https://www.firstnaukri.com/");       //Load webpage
		driver.manage().window().maximize();  			  //maximize browser window
		
		
		
		//Clicking Search button without enter proper details.
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				
				/*
				 * How to handle alert incase it is Optionally displayed at webpage.
				 * 
				 * Write a program to close alert when it is presented at webpage
				 * and ignore closing alert when it is not presented at webpage.
				 * 
				 */
				try {
					//switch to alert and get text
					String Alert_msg=driver.switchTo().alert().getText();
					System.out.println(Alert_msg);
					//switch to alert and close
					driver.switchTo().alert().accept();
				
				} catch(Exception e) {
					System.out.println("alert not presented");
				}       
					Thread.sleep(5000);
					driver.close();
					System.out.println("Run compleated");
	}


}