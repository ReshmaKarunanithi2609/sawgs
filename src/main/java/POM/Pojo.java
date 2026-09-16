package POM;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Pojo extends Base {

    // Constructor
    public Pojo() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Locators using @AndroidFindBy
    @AndroidFindBy(accessibility = "test-Username")
    private WebElement usernameField;

    public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ADD TO CART\"]")
	private List<WebElement> addToCartList;

	public List<WebElement> getAddToCartList() {
	    return addToCartList;
	}
	
	@AndroidFindBy(accessibility = "test-Password")
    private WebElement passwordField;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement loginButton;

    /////ADD TO CART 
    @AndroidFindBy(xpath ="(//android.widget.TextView[@text=\"󰇛\"])[2]")
    private WebElement addtocart;
    
    public WebElement getAddtocart() {
		return addtocart;
	}

	@AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement yourpackage;
	public WebElement getYourpackage() {
		return yourpackage;
	
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CONTINUE SHOPPING\"]")
	private WebElement continue_shopping;

	public WebElement getContinue_shopping() {
		return continue_shopping;
	}

////sort terms
	   
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement Filter;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Price (high to low)\"]")
    private WebElement highprice;
    @AndroidFindBy(xpath="(//android.widget.TextView[@text=\"ADD TO CART\"])[1]")
    private WebElement 	higherproaddcart;

	public WebElement getFilter() {
		return Filter;
	}

	public WebElement getHighprice() {
		return highprice;
	}

	public WebElement getHigherproaddcart() {
		return higherproaddcart;
	}
	////multiple pice
	/// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
private List<WebElement> priceList;

public List<WebElement> getPriceList() {
    return priceList;
}
	
	/////grid
	/// 
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView")
	private WebElement Grid;

	public WebElement getGrid() {
	   return Grid;
	}

////Product title
@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
private WebElement ProductTitle;

public WebElement getProductTitle() {
   return ProductTitle;
}

////Price element
@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"$49.99\"]")
private WebElement price;

public WebElement getPrice() {
return price;
}

//contiue shpping
@AndroidFindBy(accessibility = "test-CONTINUE SHOPPING") 
private WebElement continueShoppingButton;

public WebElement getContinueShoppingButton() {
 return continueShoppingButton;
} 

//CHECKOUT INFORMATION
@AndroidFindBy(accessibility = "test-CHECKOUT") 
private WebElement checkout;

public WebElement getCheckout() {
	return checkout;
}

@AndroidFindBy(accessibility = "test-First Name") 
private WebElement Fname_CI;


@AndroidFindBy(accessibility = "test-Last Name") 
private WebElement Lname_CI;

@AndroidFindBy(accessibility = "test-Zip/Postal Code") 
private WebElement Zipcode_CI;
 

@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CONTINUE\"]") 
private WebElement Continue_CI;

 
@AndroidFindBy(accessibility = "test-CANCEL") 
private WebElement Cancel_CI;


public WebElement getFname_CI() {
	return Fname_CI;
}

public WebElement getLname_CI() {
	return Lname_CI;
}

public WebElement getZipcode_CI() {
	return Zipcode_CI;
}

public WebElement getContinue_CI() {
	return Continue_CI;
}

public WebElement getCancel_CI() {
	return Cancel_CI;
}

//Locator for the Menu Bar icon itself
@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
private WebElement menuButton;

public WebElement getMenuButton() {
 return menuButton;
}

//Locator for the list of items inside the menu
@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ALL ITEMS\"]")
private WebElement allMenuItems;

public WebElement getAllMenuItems() {
 return allMenuItems;
 
}
@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"+\"])[2]")
private WebElement product2;

public WebElement getproduct2() {
 return product2;
 
}


@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WEBVIEW\"]")
private WebElement Webview;

public WebElement getWebview() {
 return Webview;
}

@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-GO TO SITE\"]")
private WebElement gosite;

public WebElement gosite () {
 return gosite ;
}

@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]")
private WebElement EnterUrl;

public WebElement getEnterUrl () {
 return EnterUrl ;
}

@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"mib\"]")
private WebElement google_Enter;

public WebElement getgoogle_Enter () {
 return google_Enter ;
}

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"tsbb\"]")
private WebElement google_click;

public WebElement getgoogle_click () {
 return google_click ;
}

@AndroidFindBy(xpath = "//android.view.View[@text=\"nike shoes\"]")
private WebElement choicefirst;

public WebElement getchoicefirst () {
 return choicefirst ;
}
@AndroidFindBy(xpath = "//android.view.View[@text=\"×\"]")
private WebElement xbutton;

public WebElement getxbutton() {
 return xbutton ;
}













@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"QR CODE SCANNER\"]")
private WebElement QRSCANNER;

public WebElement getQRSCANNER() {
 return QRSCANNER;
}

@AndroidFindBy(xpath ="//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]  ")
private WebElement whileusing;

public WebElement getwhileusing() {
 return whileusing;
}



@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"GEO LOCATION\"]")
private WebElement geolocation;

public WebElement getgeolocation() {
 return geolocation;
}

@AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\"test-DRAWING\"]")
private WebElement Drawing;

public WebElement getDrawing() {
 return Drawing;
}

@AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\"test-SAVE\"]")
private WebElement Drawingallow;

public WebElement getDrawingallow() {
 return Drawingallow;
}
@AndroidFindBy(xpath ="//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
private WebElement Drawingok;

public WebElement getDrawingok() {
 return Drawingok;
}
	
@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"ABOUT\"]")
private WebElement About;

public WebElement getAbout() {
 return About;
}
	
@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"LOGOUT\"]")
private WebElement Logout;

public WebElement getLogout() {
 return Logout;
}	

@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"RESET APP STATE\"]")
private WebElement appreset;

public WebElement getappreset() {
 return appreset;
}

@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup")
private List<WebElement> allMenuItems1;

public List<WebElement> getAllMenuItems1() {
 return allMenuItems1;
}

	
	
//////
/// 
    
}