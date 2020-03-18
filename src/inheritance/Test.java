package inheritance;

import org.openqa.selenium.WebDriver;

public class Test extends Repository
{

	Search_Flights Search;
	public void Tc001_Setup_browser()
			{
			
		}

		{
			
			Launch_browser("chrome");
			Search=new Search_Flights(driver);
			Load_Webpage(Search.Page_url);
			set_timeout(20);
			
		}
		

	}

