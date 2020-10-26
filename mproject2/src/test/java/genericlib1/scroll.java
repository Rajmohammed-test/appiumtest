package genericlib1;

import io.appium.java_client.android.AndroidDriver;

public class scroll {


		
		public static void scrolling(String an,String av,AndroidDriver driver){
			
			 driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
			
		}

}
