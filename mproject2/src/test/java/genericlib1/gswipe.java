package genericlib1;

import io.appium.java_client.android.AndroidDriver;

public class gswipe {
	
	public static void swipe(int startx,int starty,int endx,int endy,AndroidDriver driver)
	{
	  	driver.swipe(startx,starty,endx,endy,500);
	}
	
}


