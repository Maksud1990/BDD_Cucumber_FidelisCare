package com.fidelis.utils;

import java.io.File;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.fidelis.base.Browser;

public class Utility {
private static Logger log=Utility.getLog(Browser.class);
public static Logger getLog(Class clazz) {
	Logger log=Logger.getLogger(clazz);
	PropertyConfigurator.configure("\\src\\test\\resources\\Log4j.properties");
	return log;
}

	public static void verify(String expected, String actual) {
		if(expected.equals(actual)) {
			log.info("pass");
			
		}else {
			log.info("Fail");
			log.info("Expected: "+expected);
			log.info("Actual: "+actual);
			Assert.assertEquals(expected, actual);
		}

	}
	
	public static void takeScreenshot(WebDriver dr,String fileName ) {
		try {
			Calendar calendar = Calendar.getInstance();
			long timeMilli = calendar.getTimeInMillis();
			Thread.sleep(5000);
			TakesScreenshot scrShot = ((TakesScreenshot)dr); //We are converting our dr to TakesScreenshot
			File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File desFile=new File("target/images/"+fileName+"_"+timeMilli+".jpeg");
			FileUtils.copyFile(srcFile, desFile);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


