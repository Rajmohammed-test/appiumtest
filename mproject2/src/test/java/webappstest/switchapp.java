package webappstest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class switchapp {
	
	String calculatorApp="com.miui.calculator";
	String calculatorActivity=".cal.AllInOneCalculatorActivity";
	String voonikApp="com.mrvoonik.android";
	String voonikActivity=".splashsection.Splash";
	
	@Test
	public void insectapp3() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("appPackage", voonikApp);
		dc.setCapability("appActivity", voonikActivity);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	       WebElement drawer=driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Drawer Open']");
	       driver.tap(1, drawer, 500);
	       
	       driver.startActivity(calculatorApp, calculatorActivity);
	       
	       Thread.sleep(5000);
	       
	       driver.launchApp();
	       
	       
		
	}
	
	

}
