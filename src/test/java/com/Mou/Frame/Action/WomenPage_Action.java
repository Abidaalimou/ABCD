package com.Mou.Frame.Action;

import org.openqa.selenium.JavascriptExecutor;

import com.Mou.Frame.Locator.WomenPage_Locator;
import com.Mou.Frame.Utility.Amazon_Base__Class;

public class WomenPage_Action extends Amazon_Base__Class{

	WomenPage_Locator womenPage_Locator=new WomenPage_Locator();
	
	
	public void Clickwatchbyscrollingdown () throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Thread.sleep(10000);
		
		womenPage_Locator.CLickWatchScrool.click();
		
		Thread.sleep(10000);
		
		
		
	}
}
