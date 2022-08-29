package com.Mou.Frame.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mou.Frame.Utility.Amazon_Base__Class;

public class homePage_Locator extends Amazon_Base__Class{
	
	public homePage_Locator() {
		PageFactory.initElements(driver,this);
		
		}
		
	//Click All Menu: 
	
		@FindBy(how=How.XPATH, using="//a[@id='nav-hamburger-menu']")
		public WebElement AllMenu;
		
		//clicl Clothing
		@FindBy(how=How.XPATH, using="//div[text()='Clothing, Shoes, Jewelry & Watches']")
		public WebElement Clickclothing;
		
		
		//Click WOmen
		@FindBy(how=How.XPATH, using="//a[@href=\"/gp/browse.html?node=7147440011&ref_=nav_em__sft_women_0_2_11_3\"]")
		public WebElement ClickWomen;
		
		


		
		
		
}

