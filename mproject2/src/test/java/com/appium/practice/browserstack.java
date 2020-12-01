package com.appium.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browserstack {
	

	@Test
	public void insectapp2() throws MalformedURLException, InterruptedException
	{
	
	
	DesiredCapabilities caps = new DesiredCapabilities();
    
    // Set your access credentials
    caps.setCapability("browserstack.user", "rajmohammed1");
    caps.setCapability("browserstack.key", "4cYXBerkyjpyfLdXfWkg");
    
    // Set URL of the application under test
    caps.setCapability("app", "bs://078bb54e280438b0c19ac5d9afaaf91509003b36");
    
    caps.setCapability("appPackage", "io.appium.android.apis");
	caps.setCapability("appActivity", ".ApiDemos");
    
    // Specify device and os_version for testing
    caps.setCapability("device", "Google Pixel 3");
    caps.setCapability("os_version", "9.0");
      
    // Set other BrowserStack capabilities
    caps.setCapability("project", "First Java Project");
    caps.setCapability("build", "Java Android");
    caps.setCapability("name", "first_test");
      
    
    // Initialise the remote Webdriver using BrowserStack remote URL
    // and desired capabilities defined above
      AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
          new URL("http://hub.browserstack.com/wd/hub"), caps);
      
      
      

    /* Write your Custom code here */
      
      
    // Invoke driver.quit() after the test is done to indicate that the test is completed.
    driver.quit();
  
  }
    
}