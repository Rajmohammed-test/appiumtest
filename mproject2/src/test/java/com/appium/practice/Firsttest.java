package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;



public class Firsttest {
	
	@Test
	public void oppencal() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
	}

}
