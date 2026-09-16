package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Base {
    public static AndroidDriver driver;
    public static JavascriptExecutor js;

    public static void urlLaunch() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Pixel_Google");
        options.setUdid("emulator-5554");
        options.setApp("C:\\Users\\Admin\\Downloads\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
}
    public void ValuePass(WebElement element,String userText) {
		element.sendKeys(userText);

	}
    
    public void toclick(WebElement element) {
    	element.click();
		
	}
    public String toGetText(WebElement element) {
        String text = element.getText();
        return text;
     
    }
    public void swipeUp() {
        driver.executeScript("mobile: swipeGesture", Map.of(
            "left", 100, 
            "top", 100,
            "width", 200, 
            "height", 600,
            "direction", "up",
            "percent", 0.8
        ));
        
    }
    public void swipeDown() {
        driver.executeScript("mobile: swipeGesture", Map.of(
            "left", 100, "top", 200, "width", 800, "height", 1400,
            "direction", "down",
            "percent", 0.8
        ));
    }
}