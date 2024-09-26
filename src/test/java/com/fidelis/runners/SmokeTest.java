package com.fidelis.runners;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fidelis.base.Browser;
import com.fidelis.base.FileReading;
import com.fidelis.pages.HomePage;
import com.fidelis.pages.LoginPage;
import com.fidelis.pages.MemberOnlinePortalPage;
import com.fidelis.pages.MemberPage;
import com.fidelis.pages.ProvidersPage;
import com.fidelis.pages.ShopForAPlanPage;
import com.fidelis.utils.Utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

		@CucumberOptions(
				//strict=true,
				features= {"src/test/java/com/fidelis/features"},
				glue="com.fidelis.steps",
				monochrome=true,
			    tags= {"@smoke"},
				plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
				//dryRun=true
		
				)
		
public class SmokeTest{
//	
//	private static Logger log=Utility.getLog(SmokeTest.class);
//	//private static Logger log=Utility.getLog(Browser.class);
//	Properties pr = FileReading.readFromProperties("src\\main\\resources\\File.properties");
//	WebDriver dr;
//	HomePage hp;
//	MemberPage mp;
//	MemberOnlinePortalPage mop;
//	LoginPage lp;
//@BeforeSuite
//	 public void setJDBC() {
//	log.info("+++++++++++Our test start from here++++++++");
//}
//@BeforeMethod
//    public void FidelisCare_Member_Page_set_Up() throws InterruptedException {
//	    dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
//	    dr.get((String) pr.get("url"));
//	    HomePage hp=new HomePage(dr);
//	    hp.clickOnMemberButton();
//		hp.switchWindow();
//		hp.clickOnMembersButton();
//		hp.switchWindow();
//		Thread.sleep(3000);
//		String eMemberpt=dr.getTitle();
//		String aMemberpt="Member";
//
//		Utility.verify(eMemberpt, aMemberpt);
//		Thread.sleep(3000);
//		MemberPage mp=new MemberPage(dr);
//		mp.signUpOurMemberPortal();
//		Thread.sleep(3000);
//		mp.healthRiskAssessment();
//		Thread.sleep(3000);
//		mp.reviewYourPlanDocuments();
//		Thread.sleep(3000);
//		mp.choosePrimaryCareProviders();
//		mp.switchWindow();
//		Thread.sleep(3000);
//		mp.clickOnLoginButton1();
//		 mop=new MemberOnlinePortalPage(dr);
//		
//		mop.switchWindow();
//		mop.clickOnEnterKeyID();
//		lp=new LoginPage(dr);
//		
//		lp.OnEmailAddress();
//		lp.clickOnContinue();
//		
//		lp.userName("mdrhmn7@yahoo.com");
//		lp.clickOnPassword("Maksud1976//");
//		lp.clickOnLoginButton();
//        dr.close();
//		
//}
//
//
//@Test(priority=2)
//	public void FidelisCare_ProvidersPage_SetUp() throws InterruptedException {
//	log.info("+++++++++++Using TestNg Automation Framework+++++++++++");
//	 dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
//	    dr.get((String) pr.get("url"));
//	    HomePage hp=new HomePage(dr);
//		hp.clickOnProvidersBtn();
//		hp.switchWindow();
//		Thread.sleep(2000);
//		hp.clickOnProvidersButton();
//		
//		ProvidersPage pp=new ProvidersPage(dr);
//		Thread.sleep(3000);
//		pp.clickOnLoginBtn2();
//		hp.switchWindow();
//		lp=new LoginPage(dr);
//		Thread.sleep(3000);
//		lp.userName("username");
//		lp=new LoginPage(dr);
//		Thread.sleep(3000);
//		lp.clickOnPassword("password");
//        dr.close();
//        
//		}
//
//@Test(priority=1)
//public void FidelisCare_ShopForAPlanPage_SetUp() throws InterruptedException {
//	log.info("+++++++++++Using TestNg Automation Framework+++++++++++");
//	 dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
//	 dr.get((String) pr.get("url"));
//	log.info("+++++++++++Using TestNg Automation Framework+++++++++++");
//	HomePage hp=new HomePage(dr);
//	hp.clickOnShopForAPalan();
//	hp.switchWindow();
//	Thread.sleep(2000);
//	hp.clickOnAgainShopForAPalan();
//	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
//	Thread.sleep(2000);
//	hfpp.clickOnMedicaidManagedCare();
//	
//	Thread.sleep(2000);
//    hfpp.clickOnEssentialPlan();
//    
//	Thread.sleep(2000);
//	hfpp.clickOnChildHealthPlus();
//	Thread.sleep(2000);
//	hfpp.clickOnQHP();
//	Thread.sleep(2000);
//	hfpp.clickOnHealthierLife();
//	Thread.sleep(2000);
//	hfpp.clickOnFidelisCareAtHome();
//	Thread.sleep(2000);
//	hfpp.clickOnmedicareAdvantage();
//	Thread.sleep(2000);
//	hfpp.clickOnDualAdvantage();
//	   
//	}
//
//@AfterMethod
//public void close_the_browser() {
//	   dr.close();
//	}
//
//@AfterSuite
//	 public void emailReports() {
//		 log.info("+++++++++The report has been send+++++++++");
//}
}


