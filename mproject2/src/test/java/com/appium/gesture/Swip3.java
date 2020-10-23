package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

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
		
		int startx=(int)(ht*.80);
		int starty=(int)(bd*.10);
		int endx=(int)(ht*.20);
		int endy=(int)(bd*.10);
		int endx2=(int)(bd*.30);
		
		driver.swipe(startx, starty, endx, endy, 500);
		driver.swipe(endx, endy, endx2, endy, 500);;
		
	}



}
