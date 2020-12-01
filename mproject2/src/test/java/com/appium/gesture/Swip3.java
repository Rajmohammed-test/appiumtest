package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import genericlib1.gswipe;
import io.appium.java_client.android.AndroidDriver;

public class Swip3 {
	@Test
	public void insectapp6() throws MalformedURLException
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
		
		Dimension d=driver.manage().window().getSize();
		
		int ht=d.getHeight();
		int bd=d.getWidth();
		
		int starty=(int)(ht*.20);
		int startx=(int)(bd*.10);
		int endy=(int)(ht*.80);
		int endx=(int)(bd*.10);
		int endx2=(int)(bd*.60);
		
		gswipe.swipe(startx, starty, endx, endy,driver);
		gswipe.swipe(endx, endy, endx2, endy,driver);
		
	
		
	}



}
