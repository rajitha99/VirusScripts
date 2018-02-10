package CrossBrowserFramework;


import org.openqa.selenium.WebDriver;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.LocalDateTime; 

public class UserActions extends ObjectUtilities{
	
	WebDriver driver;
	
	public WebDriver openBrowser(String t_browserType )throws Exception
	{
	
	try
	{ 
		switch (t_browserType)
		{
		case "Firefox":case "F":
			driver=openChromeInstance(t_browserType);
			return driver;
			
		case "Chrome":case "C":
			driver=openChromeInstance(t_browserType);
			return driver;
			
		case "Internet Explorer":case "IE":
			driver=openChromeInstance(t_browserType);
			return driver;
			default:break;
		}
			System.out.println(t_browserType+"browser instanceis opened successfully");
			
		}catch(Exception e)
	{
			System.out.println(t_browserType+"browser instance is not opened successfully");
			e.printStackTrace();
	}
	return driver;
	}
	 


public static String returnUnique() {
	Calendar cal=Calendar.getInstance();
	String date=""+cal.get(Calendar.DAY_OF_MONTH)+"_"+cal.get(Calendar.MONTH+1)+"_"+cal.get(Calendar.MILLISECOND);
	return date;
	
}


public String getRandomnumber(int noofdigits)

{
	
	Calendar cal=Calendar.getInstance();
	String time=cal.getTimeInMillis()+"";

try
{
return time.substring((time.length()-noofdigits),time.length());
}
 catch(Exception e)
{
	cal=Calendar.getInstance();
	time=time+cal.getTimeInMillis()+"";
	return time.substring((time.length()-noofdigits),time.length());
}

}
}

