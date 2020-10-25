package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

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
		
		WebElement ele2=driver.findElementByAccessibilityId("Controls");
		
		WebElement ele3=driver.findElementByAccessibilityId("Dark Theme");
		
		ArrayList<WebElement> l1=new ArrayList<WebElement>();
		l1.add(ele);
		l1.add(ele2);
		l1.add(ele3);
		
		for(WebElement el:l1)
		{
			driver.tap(1, el, 500);
			Thread.sleep(2000);
		}
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='App']").click();
	}

}
