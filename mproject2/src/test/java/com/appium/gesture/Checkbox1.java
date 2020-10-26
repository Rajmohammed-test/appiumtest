package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Checkbox1 {
	@Test
	public void insectapp10() throws MalformedURLException, InterruptedException
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.findElementByAccessibilityId("Views").click();
	    
	    driver.findElementByAccessibilityId("Controls").click();
	    
	    driver.findElementByAccessibilityId("2. Dark Theme").click();
	    
	    Thread.sleep(5000);
	    
	    MobileElement el=(MobileElement)driver.findElementByAccessibilityId("Checkbox 2");
	    
	    boolean b=el.isSelected();
	    if(b)
	    {
	    	System.out.print("checked");
	    }
	    else
	    {
	    	el.click();
	    }
	
	    MobileElement el2=(MobileElement)driver.findElementByAccessibilityId("RadioButton 1");
	    String s1=el2.getAttribute("checked");
	    System.out.println(s1+"  ");
	    el2.click();
	    String s=el2.getAttribute("checked");
	    System.out.println(s+"  ");
	    Thread.sleep(2000);
	    el.click();  //uncheck checkbox
	    
	}
}
