package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class notifation {
	
	@Test
	public void insectapp54() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.bhanu.notificationreminders");
		dc.setCapability("appActivity", ".MainDrawerActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.bhanu.notificationreminders:id/txtNewNoteTitle']").sendKeys("aa");
		Thread.sleep(5000);
		
		driver.findElementByXPath("//android.widget.Button[@text='NOTIFY']").click();
		
		Thread.sleep(5000);
		
		driver.openNotifications();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Notification Reminder']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.Button[@text='Read']").click();
		
		
		
	}
	
	
	
	
	

}
