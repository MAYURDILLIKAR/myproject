package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loops {

	public static void main(String[] args)
	{
		// to print numbers 1 to 10.
		int i=1;
		do {
			System.out.println(i);
			i=i+1;
			
		} while (i<=10);
		
		int j=100;
		do 
		{
			System.out.println("first job finished =>"+j);
			j=j+1;
			
		} while (i<10);
		
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Example:--> Wait Until Expected page load at webpage.
		//Example:--> Reloading page untile expected title found..

		Boolean flag= false;
		int k=0;
		do {
			
		} while (!flag==true   );
		
		

	}

}
