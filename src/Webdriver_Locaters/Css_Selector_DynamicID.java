package Webdriver_Locaters;

import org.openqa.selenium.By.ById;

public class Css_Selector_DynamicID 

{

	private static final String By = null;

	public static void main(String[] args) 
	

	{
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			    driver.manage().window().maximize();
			    
			    
			    //Click Create account link
			   driver.findElement(ById
					   ("a[href='//register.rediff.com/register/register.php?FormName=user_details']")).click();
			    
			    
			   //Identify firstname editbox
			   driver.findElement(By.xpath("input[name*='name']")).clear();
			   driver.findElement(By.xpath("input[name*='name']")).sendKeys("Arjn");
			   
			   //identify surname editbox
			   driver.findElement(By.xpath("input[name*='login']")).clear();
			   driver.findElement(By.xpath("input[name*='login']")).sendKeys("vijay");
			   
			   
			}

		}
			}


