package com.Mou.Frame.Action;

import com.Mou.Frame.Locator.CartPage_Locator;
import com.Mou.Frame.Utility.Amazon_Base__Class;

import junit.framework.Assert;

public class CartPage_Action extends Amazon_Base__Class {
	
	CartPage_Locator cartPage_Locator=new CartPage_Locator();
	
	
	public void Clickaddtocart () throws Exception {
		cartPage_Locator.CLicAdtoCart.click();
		
		Thread.sleep(5000);
		
	}
	
	public void ClickNoThanksfrompopupbox() throws Exception {
		cartPage_Locator.NoThanks.click();
		Thread.sleep(5000);
		
	

  }
	public void Clickcartfromheadermenu() throws Exception {
		cartPage_Locator.ClickcartHeaderMenu.click();
		
		Thread.sleep(10000);
   }
	
	public void Verifyproducthasbeenadded() throws Exception {
		boolean veryfiedcart= cartPage_Locator.Verifyproduct.isDisplayed();
		Assert.assertTrue(veryfiedcart);
		
		
		
		Thread.sleep(10000);
	}
}
