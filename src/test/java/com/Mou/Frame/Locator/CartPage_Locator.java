package com.Mou.Frame.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mou.Frame.Utility.Amazon_Base__Class;

public class CartPage_Locator extends Amazon_Base__Class{
	
	
	public CartPage_Locator() {
		PageFactory.initElements(driver,this);
		
		}
	
	//Click add to cart
	@FindBy(how=How.XPATH, using="//input[@id=\"add-to-cart-button\"]")
	public WebElement CLicAdtoCart;
	
	//No thanks Pop Up
	
	@FindBy(how=How.XPATH, using="//input[@aria-labelledby=\"attachSiNoCoverage-announce\"]")
	public WebElement NoThanks;
	
	//Click Cart from Header menu
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]")
	public WebElement ClickcartHeaderMenu;
	
	//Verify product has been added to the cart successfully
	  
	@FindBy(how=How.XPATH, using="//div[@class=\"a-row sc-cart-header sc-compact-bottom\"]")
	public WebElement Verifyproduct ;
	
	
	
}



