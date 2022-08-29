package com.Mou.Frame.Action;

import org.openqa.selenium.JavascriptExecutor;

import com.Mou.Frame.Locator.WatchPage_Locator;
import com.Mou.Frame.Utility.Amazon_Base__Class;

public class WatchPage_Action extends Amazon_Base__Class{
	
	WatchPage_Locator watchPage_Locator=new WatchPage_Locator();
	
	
	public void Clickninewestwomensmeshbraceletewatch () throws Exception {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(10000);
		
		watchPage_Locator.NineWestWatch.click();
		
		Thread.sleep(10000);
		
		
	}

}
