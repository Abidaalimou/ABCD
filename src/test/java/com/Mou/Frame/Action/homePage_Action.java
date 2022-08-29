package com.Mou.Frame.Action;

import org.openqa.selenium.JavascriptExecutor;

import com.Mou.Frame.Locator.homePage_Locator;
import com.Mou.Frame.Utility.Amazon_Base__Class;

public class homePage_Action extends Amazon_Base__Class {
	
	
	homePage_Locator HomePage_Locator=new homePage_Locator();
	
	public void ClickAllmenu () throws Exception {
		HomePage_Locator.AllMenu.click();
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,50)");
		
		
		Thread.sleep(4000);
			
		
	}
	
	public void Clickclothingshoesjwelerywatches() throws Exception {
		HomePage_Locator.Clickclothing.click();
		
		Thread.sleep(10000);
		
		
	}
	
	public void Clickwomenoption() throws Exception {
		HomePage_Locator.ClickWomen.click();
		Thread.sleep(10000);
		
		
	}
	
	

}
