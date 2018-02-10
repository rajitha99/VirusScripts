package MessageObjectLayer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;



public class Property {
public static String getProperty(String args)
{
	Properties Prop = new Properties();
	try
	{
		String result="";
		InputStream inputStream;
      String propFileName="Resources\\config.properties";
		inputStream =new FileInputStream(propFileName);
		Prop.load(inputStream);
			
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	finally {
		return Prop.getProperty(args);
	}
}
}
