package com.Mou.Frame.Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Mou_Utility extends Amazon_Base__Class{
	
	
       public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//any file topic comes from apachi
		
		String currentdir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(currentdir+"/MouScreenShots/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
			

}
