package com.appium.gesture;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class zoommulti {
	@Test
	public void insectapp4() throws InterruptedException, IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Basic features']").click();
		
		Thread.sleep(5000);
		
		
		
	MobileElement ele=	(MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='com.davemorrissey.labs.subscaleview.sample:id/imageView']");
      ele.click();
	int x=(int)driver.manage().window().getSize().getWidth()/2;
	int y=(int)driver.manage().window().getSize().getHeight()/2;
	
	TouchAction finger1=new TouchAction(driver);
	finger1.press(x, y-20).moveTo(x, y-100);
	
	TouchAction finger2=new TouchAction(driver);
	finger2.press(x, y+20).moveTo(x, y+100);
	
	MultiTouchAction mts=new MultiTouchAction(driver);
	mts.add(finger1).add(finger2).perform();
		
	}

}
;