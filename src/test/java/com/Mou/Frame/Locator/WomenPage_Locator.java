package com.Mou.Frame.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mou.Frame.Utility.Amazon_Base__Class;

public class WomenPage_Locator extends Amazon_Base__Class{
	
	
	public WomenPage_Locator() {
		PageFactory.initElements(driver,this);
		
		}
	
	//Click Watch Scroll down
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div/div[4]/div/section/div/div[3]/div/div/div/div[5]/a")
	public WebElement CLickWatchScrool;
	
	
}
