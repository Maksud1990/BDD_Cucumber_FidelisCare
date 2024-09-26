package com.fidelis.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.fidelis.utils.Utility;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser {
	private static  Logger log=Utility.getLog(Browser.class);
	WebDriver dr=Browser.openBrowser("chrome");
	public static WebDriver openBrowser(String browser) {

		WebDriver dr=null;
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup(); 
			dr=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			dr=new ChromeDriver();

		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			dr=new EdgeDriver();
		}else {
			log.info("Enter the browser name either firefox or chrome");

		}
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://www.fideliscare.org/");
		return dr;
	}

}
