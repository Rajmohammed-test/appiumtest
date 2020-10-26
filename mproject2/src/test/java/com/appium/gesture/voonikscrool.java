package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import genericlib1.scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class voonikscrool {
	static AndroidDriver driver;
	@Test
	public void insectapp3() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.mrvoonik.android");
		dc.setCapability("appActivity", ".splashsection.Splash");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		 driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
       WebElement drawer=driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Drawer Open']");
       
       driver.tap(1, drawer, 500);
       
      scroll.scrolling("text","Refund Policy",driver);
       
       MobileElement element =(MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Refund Policy']");
       element.click();
	}     
    /*   public static void scrolling(String an , String av) 
       {
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
       }  */

       
	}

