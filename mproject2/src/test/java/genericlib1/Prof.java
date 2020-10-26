package genericlib1;

import java.io.FileInputStream;
import java.util.Properties;



public class Prof {
	
	public String getPropertyKeyValue(String key) throws Throwable  {
		  
		FileInputStream fis = new FileInputStream("./Testdata/config.properties");
		 Properties pObj = new Properties();
		 pObj.load(fis);
		 String value = pObj.getProperty(key);
	
	return value;
}


}
