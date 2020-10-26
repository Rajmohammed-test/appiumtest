package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class appiumapp5 {
	
	@Test
	public void insectapp2() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		System.out.println("first ori   "+driver.getOrientation());
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		driver.findElementByAccessibilityId("Accessibility").click();
		
		System.out.println("second ori   "+driver.getOrientation());
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("third ori   "+driver.getOrientation());
		
		
	}

}
