package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import genericlib1.touch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Dragdrop {
	
	@Test
	
	public void insectapp7() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		dc.setCapability("appActivity", ".Launcher");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		Thread.sleep(5000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Basic usage playground']").click();
		Thread.sleep(5000);
		
		WebElement src=driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.mobeta.android.demodslv:id/drag_handle']");
		Thread.sleep(2000);
		WebElement dst=driver.findElementByXPath("//android.widget.TextView[@text='Herbie Hancock']");
		
		touch.dragdrop(src,dst,driver);
		
		
		
		
	}

}
