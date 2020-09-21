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

public class Page4 
{
	RemoteWebDriver queen;
	Actions a;
	Set<String> wins;
	List<String> lwins;

	//search and select mobile cover
	@FindBy(how=How.NAME, using="q")
	public WebElement search;
	@FindBy(how=How.XPATH, using="(//img[@class='_1Nyybr  _30XEf0'])[2]")
	public WebElement mobile;
	
	//add to cart mobile cover
	@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	public WebElement addcover;
	
	//remove one item from the cart
	@FindBy(how=How.XPATH, using="(//div[text()='Remove'])[2]")
	public WebElement remove;
	@FindBy(how=How.XPATH, using="(//div[text()='Remove'])[1]")
	public WebElement removeconfirm;
	
	//login to account, to place order
	@FindBy(how=How.XPATH, using="//button[@class='_2AkmmA iwYpF9 _7UHT_c']")
	public WebElement login;
	@FindBy(how=How.XPATH, using="//input[@type='text']")
	public WebElement username;
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public WebElement enter;
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public WebElement password;
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public WebElement enterclick;
	
					
	

	public Page4(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
		a=new Actions(queen);

		//common code for multiple windows
		
	}

	public void search_MobileCoveer() throws Exception
	{
		wins=queen.getWindowHandles();
		lwins=new ArrayList<String>(wins);
		queen.switchTo().window(lwins.get(0));
		search.sendKeys("mobile covers",Keys.ENTER);
		Thread.sleep(5000);
		mobile.click();
		Thread.sleep(5000);
	}		
	
	public void add_MobileCover() throws Exception
	{
		wins=queen.getWindowHandles();
		lwins=new ArrayList<String>(wins);
		Thread.sleep(5000);
		queen.switchTo().window(lwins.get(1));
		addcover.click();
		Thread.sleep(5000);
	}
	
	public void remove_Item() throws Exception
	{
		remove.click();
		Thread.sleep(5000);
		removeconfirm.click();
		Thread.sleep(5000);
	}
	
	public void login_Account() throws Exception
	{
		login.click();
		username.sendKeys("srinivas2k13@gmail.com");;
		// Thread.sleep(5000);
		enter.click();
		Thread.sleep(5000);
		password.sendKeys("lalbalpal1905");
		//Thread.sleep(5000);
		enterclick.click();
		Thread.sleep(5000);
		
	}
	
}
