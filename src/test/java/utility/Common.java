package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Common
{
	RemoteWebDriver queen;
	public RemoteWebDriver open_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		queen= new ChromeDriver();
		queen.manage().window().maximize();
		return(queen);
	}

	public void launch_site() throws Exception
	{
		queen.get("https://www.flipkart.com");
		Thread.sleep(5000);
	}

	public void quit_site()
	{
		queen.quit();
	}



}
