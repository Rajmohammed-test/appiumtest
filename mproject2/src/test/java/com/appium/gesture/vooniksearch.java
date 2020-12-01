package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import genericlib1.touch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class vooniksearch {
	
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
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
       WebElement search=driver.findElementByXPath("//android.widget.TextView[@content-desc='Search']");
       
      touch.press(search, driver);
       
       WebElement ele=driver.findElementByXPath("//android.widget.EditText[@resource-id='com.mrvoonik.android:id/search']");
       
              
       ele.sendKeys("Shirts");
       
       
      
	}

}
