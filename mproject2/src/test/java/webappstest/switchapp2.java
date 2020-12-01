/**
 * 
 */
package webappstest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * @author rajkl
 *
 */
public class switchapp2 {
	
	@Test
	public void oppencal2222() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("raj");
		
		driver.findElementByXPath("/android.widget.EditText[@text='Let's Shop']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();

		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Visit to the website to complete purchase']").click();
		
		Set<String> apps =driver.getContextHandles();
		
		for(String ap:apps)
		{
			System.out.println(ap);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore ");
		
		driver.findElementByXPath("//input[@name='q']").sendKeys("hiii");
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		
		driver.context("NATIVE_APP");

	}
	


}
