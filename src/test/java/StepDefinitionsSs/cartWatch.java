package StepDefinitionsSs;

import com.Mou.Frame.Action.CartPage_Action;
import com.Mou.Frame.Action.WatchPage_Action;
import com.Mou.Frame.Action.WomenPage_Action;
import com.Mou.Frame.Action.homePage_Action;
import com.Mou.Frame.Utility.Amazon_Base__Class;
import com.Mou.Frame.Utility.Mou_Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cartWatch extends Amazon_Base__Class{
	
	homePage_Action HomePage_Action=new homePage_Action();
	WomenPage_Action womenPage_Action=new WomenPage_Action();
	WatchPage_Action watchPage_Action=new WatchPage_Action();
	CartPage_Action cartPage_Action=new CartPage_Action();
	
	
	@Given("^Launch \"([^\"]*)\" applicationS$")
	public void launch_applicationS(String URL) throws Throwable {
		getURL(URL);
	}

	@Then("^Click All menu$")
	public void click_All_menu() throws Throwable {
		HomePage_Action.ClickAllmenu();
	}

	@Then("^Click clothing shoes jwelery watches$")
	public void click_clothing_shoes_jwelery_watches() throws Throwable {
		HomePage_Action.Clickclothingshoesjwelerywatches();
		Mou_Utility.takescreenshot(driver, "Amazon Home Page");
	}
	    

	@Then("^Click women option$")
	public void click_women_option() throws Throwable {
		HomePage_Action.Clickwomenoption();
		
	}

	@Then("^Click watch by scrolling down$")
	public void click_watch_by_scrolling_down() throws Throwable {
		womenPage_Action.Clickwatchbyscrollingdown();
		Mou_Utility.takescreenshot(driver, "Amazon women Page");
	}

	@Then("^Click nine west womens mesh bracelete watch$")
	public void click_nine_west_womens_mesh_bracelete_watch() throws Throwable {
		watchPage_Action.Clickninewestwomensmeshbraceletewatch();
		Mou_Utility.takescreenshot(driver, "Amazon watch Page");
		
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		cartPage_Action.Clickaddtocart();
	}

	@Then("^Click No Thanks from popup box$")
	public void click_No_Thanks_from_pop_up_box() throws Throwable {
		cartPage_Action.ClickNoThanksfrompopupbox();
	}

	@Then("^Click cart from header menu$")
	public void click_cart_from_header_menu() throws Throwable {
		cartPage_Action.Clickcartfromheadermenu();
	}

	@Then("^Verify product has been added to the cart successfully$")
	public void verify_product_has_been_added_to_the_cart_successfully() throws Throwable {
		cartPage_Action.Verifyproducthasbeenadded();
		Mou_Utility.takescreenshot(driver, "Amazon Cart Page");
	}



}
