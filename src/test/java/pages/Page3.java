package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page3
{
	RemoteWebDriver queen;
	Actions a;
	Set<String> wins;
	List<String> lwins;


	//add to cart 
	@FindBy(how=How.XPATH, using="//input[contains(@placeholder,'Enter delivery pincode')]")
	public WebElement pin;

	//select size to add to cart
	@FindBy(how=How.XPATH, using="(//div[@class='_37KLG6 _3K7Qff col col-12-12'])[2]/descendant::ul/li[5]/a")
	public WebElement csize2;
	@FindBy(how=How.XPATH, using="(//div[@class='_37KLG6 _3K7Qff col col-12-12'])[1]/descendant::ul/li[5]/a")
	public WebElement csize1;
	@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	public WebElement tocart;

	public Page3(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
		a=new Actions(queen);
	}

	public void add_To_Cart() throws Exception
	{
		Thread.sleep(8000);
		//common code for multiple windows
		wins=queen.getWindowHandles();
		lwins=new ArrayList<String>(wins);

		try
		{
			queen.switchTo().window(lwins.get(1));
		}
		catch(Exception e)
		{
			queen.switchTo().window(lwins.get(0));	
		}
		queen.executeScript("document.getElementsByTagName('button')[0].removeAttribute('disabled');");
		pin.clear();
		Thread.sleep(5000);
		pin.sendKeys("500049",Keys.ENTER);
		Thread.sleep(5000);
		queen.executeScript("window.scrollBy(0,320);");
		Thread.sleep(8000);
		try
		{
			csize2.click();
		}
		catch(Exception e)
		{
			csize1.click();
		}
		Thread.sleep(5000);
		tocart.click();
		Thread.sleep(10000);
		queen.close();
	}
}
