package com.Mou.Frame.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mou.Frame.Utility.Amazon_Base__Class;

public class WatchPage_Locator extends Amazon_Base__Class{
	
	
	
	public WatchPage_Locator() {
		PageFactory.initElements(driver,this);
		
		}
	
	//Click Watch Scroll down
	@FindBy(how=How.XPATH, using="//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/span/div/a/div[1]/div")
	public WebElement NineWestWatch;
	
	
}



