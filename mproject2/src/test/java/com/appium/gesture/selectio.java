package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class selectio {
	
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.findElementByAccessibilityId("Views").click();
	    
	    driver.findElementByAccessibilityId("Controls").click();
	    
	    driver.findElementByAccessibilityId("2. Dark Theme").click();
	    driver.hideKeyboard();
	    Thread.sleep(5000);
	    driver.findElementByXPath("//android.widget.TextView[@text='Mercury']").click();
	    
	   List<MobileElement> Option= driver.findElementsByClassName("android.widget.CheckedTextView");
	   String Exp="Jupiter";
	   for(MobileElement m:Option)
	   {
		   String S=m.getText();
		   if(S.equals(Exp))
		   {
			   m.click();
			   break;
		   }
		   
	   }
	   
	    
	}

}
