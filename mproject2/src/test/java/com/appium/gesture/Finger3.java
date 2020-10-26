package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Finger3 {
	@Test
	public void insectapp5() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		int x=(int)driver.manage().window().getSize().getWidth()/2;
		int y=(int)driver.manage().window().getSize().getHeight()/2;
		
		TouchAction finger1=new TouchAction(driver);
		finger1.press(x+100, y-300).moveTo(x+100, y+300);
		
		TouchAction finger2=new TouchAction(driver);
		finger2.press(x-100, y-300).moveTo(x-100, y+300);
		
		TouchAction finger3=new TouchAction(driver);
		finger3.press(x-200, y-300).moveTo(x-200, y+300);
		
		
	
		
		
		MultiTouchAction mts=new MultiTouchAction(driver);
		mts.add(finger1).add(finger2).add(finger3).perform();
			
		
	}

}
