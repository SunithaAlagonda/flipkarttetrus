package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page2
{
	RemoteWebDriver queen;
	Actions a;

	//set min price as 400
	@FindBy(how=How.XPATH, using="(//div[@class='_1qKb_B'])/select")
	public WebElement price;

	//select brand converse
	@FindBy(how=How.XPATH, using="(//div[@title='Converse'])[1]/descendant::div[3]")
	public WebElement brand;

	//select size 10
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[3]/div[4]")
	public WebElement items;
	@FindBy(how=How.XPATH, using="(//div[@class='_3mk-PQ'])[6]/div/div[8]")
	public WebElement size;

	//select newest first
	@FindBy(how=How.XPATH, using="//div[text()='Newest First']")
	public WebElement newest;

	//mouse over to see available sizes
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[1]/div[1]")
	public WebElement first;
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[2]/div[3]")
	public WebElement second;
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[3]/div[2]")
	public WebElement third;
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[4]/div[4]")
	public WebElement forth;

	//select first item
	@FindBy(how=How.XPATH, using="(//div[@class='_3O0U0u'])[1]/div[1]")
	public WebElement item;

	public Page2(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
		a=new Actions(queen);
	}

	public void select_Price() throws Exception
	{
		Select s= new  Select(price);
		List<WebElement> opt=s.getOptions();

		for(int i=0;i<opt.size();i++)
		{
			String sp=s.getOptions().get(i).getText();
			if(sp.equals("400"))
			{
				s.getOptions().get(i).click();
			}
			else if(sp.equals("500"))
			{
				s.getOptions().get(i).click();
			}
		}
		Thread.sleep(5000);
	}

	public void brand_converse() throws Exception
	{
		Thread.sleep(3000);
		brand.click();
		Thread.sleep(5000);
	}

	public void select_Size() throws Exception
	{
		a.moveToElement(size).perform();
		size.click();
		Thread.sleep(3000);
	}

	public void newest_First() throws Exception
	{
		newest.click();
		Thread.sleep(2000);
	}

	public void mouse_OverItems() throws Exception
	{
		a.moveToElement(first).perform();
		Thread.sleep(2000);
		a.moveToElement(second).perform();
		Thread.sleep(2000);
		a.moveToElement(third).perform();
		Thread.sleep(2000);
		a.moveToElement(forth).perform();
		Thread.sleep(2000);
	}

	public void select_FirstItem() throws Exception
	{
		Thread.sleep(3000);
		item.click();
		Thread.sleep(2000);
	}
}
