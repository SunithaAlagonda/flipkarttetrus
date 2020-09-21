package tests;

import org.openqa.selenium.remote.RemoteWebDriver;

import pages.Page1;
import pages.Page2;
import pages.Page3;
import pages.Page4;
import utility.Common;
public class Runner 
{
	public static void main(String[] args) throws Exception 
	{
		
		Common util= new Common();
		RemoteWebDriver queen=util.open_Browser();
		Page1 p1= new Page1(queen);
		Page2 p2= new Page2(queen);
		Page3 p3= new Page3(queen);
		Page4 p4= new Page4(queen);
		
		util.launch_site();
		p1.close_banner();
		p1.click_Men();
		p1.click_CasualShoes();
		p2.brand_converse();
		p2.select_Price();
		p2.select_Size();
		p2.newest_First();
		p2.mouse_OverItems();
		p2.select_FirstItem();
		p3.add_To_Cart();
		p4.search_MobileCoveer();
		p4.add_MobileCover();
		p4.remove_Item();
		p4.login_Account();
		util.quit_site();
		
	}

}
