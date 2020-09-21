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
import org.openqa.selenium.support.ui.Select;

public class Page1 
{
	RemoteWebDriver queen;
	Actions a;
	@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _29YdH8']")
	public WebElement banner;

	//click men
	@FindBy(how=How.XPATH, using="(//div[@class='zi6sUf'])/descendant::span[3]")
	public WebElement men;

	//select casual shoes
	@FindBy(how=How.XPATH, using="(//*[text()='Casual Shoes'])[1]")
	public WebElement shoes;

	public Page1(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
		a=new Actions(queen);
	}

	public void close_banner()
	{
		banner.click();
	}

	public void click_Men() throws Exception
	{
		a.clickAndHold(men).build().perform();
		Thread.sleep(5000);
	}

	public void click_CasualShoes() throws Exception
	{
		shoes.click();
		Thread.sleep(5000);
	}
}
