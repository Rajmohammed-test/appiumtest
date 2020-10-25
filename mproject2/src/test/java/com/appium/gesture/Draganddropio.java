package com.appium.gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Draganddropio {
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
	    
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Drag and Drop']").click();
		MobileElement src=(MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']");
		MobileElement dst=(MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_3']");
		MobileElement dst1=(MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_2']");
		TouchAction ts=new TouchAction(driver);
		//ts.longPress(src).waitAction().moveTo(dst).release().perform();
		Thread.sleep(10000);
		ts.longPress(src).waitAction().moveTo(dst1).release().perform();
		
	}

}
