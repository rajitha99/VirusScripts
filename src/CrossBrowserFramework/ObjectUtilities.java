package CrossBrowserFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ObjectUtilities {


public WebDriver openChromeInstance(String t_browserType )throws Exception
{
	
	WebDriver r_driver=null;
	System.setProperty("webdriver.chrome.driver","D:\\\\AutomationPractise\\\\drivers\\\\chromedriver.exe");
	
	
	try{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("test-type");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-web-security");
	options.addArguments("--allow-running-insecure-content");
	capabilities.setCapability("chrome.binary", "D:\\\\AutomationPractise\\\\drivers\\\\chromedriver.exe");
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    r_driver=new ChromeDriver(capabilities);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
return r_driver;
}



public WebDriver openFireFoxInstance(String t_browserType )throws Exception
{
	
	WebDriver r_driver=null;
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	
	try{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("test-type");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-web-security");
	options.addArguments("--allow-running-insecure-content");
	capabilities.setCapability("chrome.binary", "C:\\chromedriver.exe");
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    r_driver=new ChromeDriver(capabilities);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
return r_driver;
}



public WebDriver openInternetInstance(String t_browserType )throws Exception
{
	
	WebDriver r_driver=null;
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	
	try{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("test-type");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-web-security");
	options.addArguments("--allow-running-insecure-content");
	capabilities.setCapability("chrome.binary", "C:\\chromedriver.exe");
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    r_driver=new ChromeDriver(capabilities);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
return r_driver;
}

}
