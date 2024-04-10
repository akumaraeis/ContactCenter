package com.dms.basetest;



import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.dms.pageObjects.AccountPage;
import com.dms.pageObjects.ContactPage;
import com.dms.pageObjects.HomePage;
import com.dms.utility.ReadConfig;



public class BaseTest {
	
	// public ReadConfig rc;
	
	

	public static RemoteWebDriver driverR;
//	public static WebDriver driverR;
//    public String baseurl = rc.getApplicationURL();
    public static  WebDriver driverL;
    public HomePage hp ;
    public AccountPage ap;
    public ContactPage cp;
    
 
	

	//*********To Run in Local Machine
//		public void initBrowser( ) 
//	{	
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("--incognito");
//		options.addArguments("--disable-notification");
//		driverR = new ChromeDriver(options);
//		}
////
//	
	
	
		//****To Run Code in Virtual Cloud Machine.
	
    
	
	public void initBrowser(String Machinename ) throws IOException
	{
		
		
	switch(Machinename)
	{
	case "Remote" :
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		browserOptions.setCapability("unhandledPromptBehavior", "dismiss");
		browserOptions.setImplicitWaitTimeout(Duration.ofMillis(20));
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-amit.qa681-717ea");
		sauceOptions.put("accessKey", "20474589-5403-4e71-a182-632015990935");
		sauceOptions.put("build", "<your build id>");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
	 driverR = new RemoteWebDriver(url, browserOptions);
	 driverR.get(getFile("baseurl"));
////		driverR = new ChromeDriver();
		break;
	case "Local" :
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
	//	options.addArguments("--incognito");
		options.addArguments("--disable-notification");
		driverR = new ChromeDriver(options);
		driverR.get("http://localhost:3000/");
	

		
////		driverR = new FirefoxDriver();
		break;
			default:
		System.err.println("Please provide valid Machine_Name");
		break;
	}
	driverR.manage().window().maximize();
//	driverR.manage().deleteAllCookies();
	
	}
	
	

	public void launchUrl() throws IOException
	{
		driverR.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	driverR.get(baseurl);
	//	driverR.get(getFile("baseurl"));
	
	}
	
	public  String getFile(String filename) throws IOException
	{
		Properties prop = new Properties();
		String p1 = "C:\\Users\\ATLAS-ADMIN\\eclipse-workspace\\AEIS-DMS1\\Configuration\\config.properties" ;
		FileInputStream fis = new FileInputStream(p1);
		prop.load(fis);
		String data = prop.getProperty(filename);
		return data;
	}
	
	 public void creatingObject() throws IOException
	 {
		   hp = new HomePage(driverR);
		   ap = new AccountPage(driverR);
		   cp = new ContactPage(driverR);
	 }
	

	public void teardown()
	{
		driverR.close();
	}

}
