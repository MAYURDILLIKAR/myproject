package method_parameters;
import org.junit.Test;

import method_parameters.Keywords;

public class Run_Keyword_using_testing {

	public static void main(String[] args)
	{


		class Run_Keyword_Using_Testng extends Keywords
		{
		  @Test
		  public void Register_with_Instargram_From_FB() throws Exception 
		  {
			  click_element(By.linkText("Instagram"));
			  switchto_window("Instagram");
			  Thread.sleep(5000);
			  capturescreen("InstagramWindow");
			  
			  Enter_text("//input[@aria-label='Mobile Number or Email']", "9030248855");
			  Enter_text(By.name("fullName"), "MQ-Dsnr");
			  capturescreen("Insta_Reg_Form");
		  }
		  
		  @BeforeClass
		  public void Set_browser()
		  {
			  Launch_Browser("chrome");
			  LaunchApp("http://facebook.com");
			  set_timeout(30);
		  }
		  
		  @AfterClass
		  public void Close_Browser()
		  {
			  driver.quit();   
			  /*
			   * 	driver is a global variable at Keyword Class, Becuase
			   * 	keyword class inherited to current class we can user 
			   * 	keyword class global variables and mehtods directly
			   * 	without object creation..
			   * 
			   */
			  
		  }
		  
		}
		
	}

}
