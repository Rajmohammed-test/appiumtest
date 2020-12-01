package webappstest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class chrome {
	
	@Test
	public void oppencal51() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.O");
		dc.setCapability("UDID", "3cfaaad07d74");
		dc.setCapability("browserName", "chrome");
		dc.setCapability("noReset", true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.get("https://www.facebook.com");
		
		
		  Thread.sleep(2000);
		  driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("qwerty");
		  Thread.sleep(2000);
		  driver.findElementByXPath("//input[@id='m_login_password']").sendKeys("222");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  
		  
		
		
	}

}
