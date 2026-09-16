package Stepdefinition;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import Base.Base;
import POM.Pojo;

public class LoginSteps extends Base {
   
	public static Pojo P;
	
	

    @Given("User launch the application on emulator")
    public void user_launch_the_application_on_emulator() throws MalformedURLException {
    	urlLaunch();
    	P = new Pojo();
    	  
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
    	
    	ValuePass(P.getUsernameField(), "standard_user");
    	ValuePass(P.getPasswordField(), "secret_sauce");  
    }
    
@When("User clicks on the login button")
public void user_clicks_on_the_login_button() {
	
	 toclick(P.getLoginButton());
	 
	 boolean isLoginSuccessful = P.getProductTitle().isDisplayed();
	    org.junit.Assert.assertTrue("Login failed: Home page is not visible", isLoginSuccessful);
	
}

@When("User clicks on ADD to cart")
public void user_clicks_on_add_to_cart() {
	
    toclick(P.getAddtocart());
}
@When("User clicks on the cart icon")
public void user_clicks_on_the_cart_icon() {
	
    toclick(P.getYourpackage());
}

@Then("User clicks on the Filter icon")
public void user_clicks_on_the_filter_icon() {
   
    toclick(P.getFilter());
}

@Then("User clicks on the hightolow icon")
public void user_clicks_on_the_hightolow_icon() {
    toclick(P.getHighprice());
    toclick(P.getHigherproaddcart());
}

@Then("the user should be validtate the price")
public void the_user_should_be_validtate_the_price() {
    
	String actualPrice = toGetText(P.getPrice());
    org.junit.Assert.assertEquals("Price validation failed!", "$49.99", actualPrice);
    System.out.println("Verified Price: " + actualPrice);
}

@Then("user Click the continue shopping")
public void user_click_the_coutine_shopping() throws InterruptedException {
	swipeUp();
	Thread.sleep(5000);
    toclick(P.getContinueShoppingButton());
}

@Then("the User click the Checkout Information")
public void the_user_click_the_checkout_information() {
	
	toclick(P.getCheckout());
    
}
@Then("User Fill the form DETAILS")
public void user_fill_the_form_details() {
	ValuePass(P.getFname_CI(), "reshma");
	ValuePass(P.getLname_CI(), "karunanithi");
	ValuePass(P.getZipcode_CI(), "621220");
	
    
}
@Then("User click the cancelbutton")
public void user_click_the_cancelbutton() throws InterruptedException {
	swipeUp();
	Thread.sleep(2000);
	toclick(P.getCancel_CI());
   
}

////MENU BAR

//LoginSteps.java
@Then("user clicks on ALL ITEMS from the menu list")
public void the_user_clicks_on_all_items() throws InterruptedException {
   
    toclick(P.getMenuButton());
    
    
    Thread.sleep(2000); 
    
   
    List<WebElement> items = P.getAllMenuItems1();
    
    
    for (WebElement item : items) {
        try {
            String itemText = item.getText();
            System.out.println("Menu item: " + itemText);
            
            if (itemText.equalsIgnoreCase("ALL ITEMS")) {
                item.click();
                System.out.println("Clicked on ALL ITEMS successfully!");
                break;
            }
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            continue;}
    }
        
    }

@When("User finds highest and lowest price")
public void user_finds_highest_and_lowest_price() {
	
	toclick(P.getGrid());

	 List<WebElement> addToCartList = P.getAddToCartList();

	    try {

	        for (int i = 0; i < 2; i++) {
	            addToCartList.get(i).click();
	        }

	    } catch (Exception e) {

	        System.out.println("Unable to add first two packages: " + e.getMessage());

	    } finally {

	        System.out.println("First two packages selection completed");
	    }
	}

@When("user scrolls and adds all products to cart")
public void userScrollsAndAddsAllProductsToCart() {
	
	toclick(P.getMenuButton());
	toclick(P.getAllMenuItems());
	

    List<String> addedProducts = new ArrayList<>();

    for (int i = 0; i < 3; i++) {

        List<WebElement> priceList = P.getPriceList();
        List<WebElement> addToCartList = P.getAddToCartList();

        for (int j = 0; j < addToCartList.size(); j++) {

            String price = priceList.get(j).getText();

            if (!addedProducts.contains(price)) {

                addToCartList.get(j).click();

                addedProducts.add(price);

                System.out.println(
                    "Product Added To Cart : " + price
                );
            }
        }

        swipeDown();
    }

    System.out.println(
        "Total Products Added : " + addedProducts.size()
    );

    Assert.assertEquals(6, addedProducts.size());
}

    
///menu bar=====================================================================
/// 
/// 
@Then("user clicks on ALL ITEMS from the menu bar")
public void user_clicks_on_all_items_from_the_menu_bar() {
	toclick(P.getMenuButton());
	toclick(P.getAllMenuItems());
	toclick(P.getGrid());
	
	toclick(P.getproduct2());
    
}
@Then("User click the Webview and give the url")
public void user_click_the_webview_and_give_the_url() throws InterruptedException {
	toclick(P.getMenuButton());
	toclick(P.getWebview());
	ValuePass(P.getEnterUrl(), "https://www.google.com");
	toclick(P.gosite());
	Thread.sleep(3000);
	ValuePass(P.getgoogle_Enter(), "shoes");
	Thread.sleep(3000);
	toclick(P.getgoogle_Enter());
	toclick(P.getchoicefirst());
	Thread.sleep(3000);
	toclick(P.getxbutton());
	
	
   
}
@Then("User click the QRScanner")
public void user_click_the_qr_scanner() throws InterruptedException {
	toclick(P.getMenuButton());
	toclick(P.getQRSCANNER());
	toclick(P.getwhileusing());
	Thread.sleep(3000);
   
}
@Then("User click the GEOLOCATION")
public void user_click_the_geolocation() {
	toclick(P.getMenuButton());
	toclick(P.getgeolocation());
    
}
@Then("Uer click the Drawing and allow the image")
public void uer_click_the_drawing_and_allow_the_image() throws InterruptedException {
	
	toclick(P.getMenuButton());
	toclick(P.getDrawing());
	toclick(P.getLogout());
	
	
	
}

}

    





