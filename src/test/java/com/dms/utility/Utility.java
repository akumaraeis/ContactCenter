package com.dms.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.dms.basetest.BaseTest;

public class Utility extends BaseTest {
	public static String getScreenshot() throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driverR;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	File dest = new File ("C:\\Users\\ATLAS-ADMIN\\eclipse-workspace\\AEIS-DMS1\\AEIS-DMS-Screenshots\\No"+timeStamp+".jpg");
	//File dest = new File ("C:\\Users\\ATLAS-ADMIN\\eclipse-workspace\\AEIS-DMS1\\AEIS-DMS-Screenshots\\No"+System.currentTimeMillis()+".jpg");
	FileHandler.copy(src, dest);
	
	String screenshotpath = dest.getAbsolutePath();
	return screenshotpath;
	
	}
	
}

