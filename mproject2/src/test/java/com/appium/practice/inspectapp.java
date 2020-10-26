package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import genericlib1.taap;
import io.appium.java_client.android.AndroidDriver;

public class inspectapp {

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
		
		WebElement ele=driver.findElementByAccessibilityId("Views");
		taap.tap(ele, driver);
		
		WebElement ele2=driver.findElementByAccessibilityId("Controls");
		taap.tap(ele2, driver);
		
		WebElement ele3=driver.findElementByAccessibilityId("2. Dark Theme");
		taap.tap(ele3, driver);
		
		
	
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='App']").click();
	}

}
