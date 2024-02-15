package com.dms.basetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.dms.pageObjects.CreateDocPage;
import com.dms.pageObjects.LoginPage;
import com.dms.utility.ReadConfig;



public class BaseTest {
	
	// public ReadConfig rc;
	
	
	public LoginPage lp;
	public CreateDocPage cd;
//	public static RemoteWebDriver driverR;
	public static WebDriver driverR;
//    public String baseurl = rc.getApplicationURL();
//    public static  WebDriver driverR;
	

	//*********To Run in Local Machine
	public void initBrowser( ) 
	{	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-notification");
		driverR = new ChromeDriver(options);
		}
	
	
	
	
		//****To Run Code in Virtual Cloud Machine.
	
/*	public void initBrowser(String browsername ) throws MalformedURLException
	{
	switch(browsername.toLowerCase())
	{
	case "chrome" :
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-amit.qa681-717ea");
		sauceOptions.put("accessKey", "20474589-5403-4e71-a182-632015990935");
		sauceOptions.put("build", "AEIS_DMS_001");
		sauceOptions.put("name", "Login Functionality");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		driverR = new RemoteWebDriver(url, browserOptions);
//		driverR = new ChromeDriver();
		break;
	case "firefox" :
		FirefoxOptions browserOptions2 = new FirefoxOptions();
		browserOptions2.setPlatformName("Windows 11");
		browserOptions2.setBrowserVersion("latest");
		Map<String, Object> sauceOptions2 = new HashMap<>();
		sauceOptions2.put("username", "oauth-amit.qa681-717ea");
		sauceOptions2.put("accessKey", "20474589-5403-4e71-a182-632015990935");
		sauceOptions2.put("build", "build\", \"AEIS_DMS_001");
		sauceOptions2.put("name", "Login Functionality");
		browserOptions2.setCapability("sauce:options", sauceOptions2);

		URL url2 = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		 driverR = new RemoteWebDriver(url2, browserOptions2);
//		driverR = new FirefoxDriver();
		break;
	case "edge" :
		EdgeOptions browserOptions3 = new EdgeOptions();
		browserOptions3.setPlatformName("Windows 11");
		browserOptions3.setBrowserVersion("latest");
		Map<String, Object> sauceOptions3 = new HashMap<>();
		sauceOptions3.put("username", "oauth-amit.qa681-717ea");
		sauceOptions3.put("accessKey", "20474589-5403-4e71-a182-632015990935");
		sauceOptions3.put("build", "AEIS_DMS_001");
		sauceOptions3.put("name", "Login Functionality");
		browserOptions3.setCapability("sauce:options", sauceOptions3);

		URL url3 = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		driverR = new RemoteWebDriver(url3, browserOptions3);
//		driverR = new EdgeDriver();
		break;
		default:
		System.err.println("Please provide valid browser Name");
		break;
	}
	driverR.manage().window().maximize();
	}
	*/
	public void launchUrl() throws IOException
	{
		driverR.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driverR.get(baseurl);
		driverR.get(getFile("baseurl"));
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
		  lp = new LoginPage(driverR);
	//	  rc = new ReadConfig();
		  cd = new CreateDocPage(driverR);
	 }
	

	public void teardown()
	{
		driverR.close();
	}

}
