package genericlib1;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class touch {
	
	
	public static void dragdrop(WebElement src, WebElement dst,AndroidDriver driver){
		
		TouchAction ta=new TouchAction(driver);
		ta.longPress(src).waitAction().moveTo(dst).release().perform();
		
	}
	
	public static void press(WebElement ele,AndroidDriver driver)
	{
		TouchAction ta=new TouchAction(driver);
		ta.press(ele).release().perform();
	}
	
	public static void finger(int startx,int starty,int endx,int endy,AndroidDriver driver){
		TouchAction finger1=new TouchAction(driver);
		finger1.press(startx, starty).moveTo(endx, endy);
		
	
	}
	
	public static void mutlitouch(TouchAction finger1,TouchAction finger2,AndroidDriver driver){
		
		MultiTouchAction  mts=new MultiTouchAction(driver);
	    mts.add(finger1).add(finger2).perform();
		
	}

}
