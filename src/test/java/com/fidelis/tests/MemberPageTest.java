package com.fidelis.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.fidelis.base.Base;
import com.fidelis.pages.HomePage;
import com.fidelis.pages.MemberOnlinePortalPage;
import com.fidelis.pages.MemberPage;
import com.fidelis.utils.Utility;

public class MemberPageTest extends Base {
	@Test
	public void varifyMemberPageTitle() throws InterruptedException {
		HomePage hp=new HomePage(dr);

		hp.clickOnMemberButton();
		hp.switchWindow();
		hp.clickOnMembersButton();
		hp.switchWindow();
		Thread.sleep(4000);
		String eMemberpt=dr.getTitle();
		String aMemberpt="Member";

		Utility.verify(eMemberpt, aMemberpt);
		Thread.sleep(3000);
		MemberPage mp=new MemberPage(dr);
		mp.signUpOurMemberPortal();
		Thread.sleep(3000);
		mp.healthRiskAssessment();
		Thread.sleep(3000);
		mp.reviewYourPlanDocuments();
		Thread.sleep(3000);
		mp.choosePrimaryCareProviders();
		mp.switchWindow();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		//MemberOnlinePortalPage mop=new MemberOnlinePortalPage();
		//mp.switchWindowOne();

		//dr.findElement(By.xpath("/div[contains(text(),'Step 1: Sign Up for Our Member Portal')]")).click();

//		WebElement HealthRiskAssesment = dr.findElement(By.xpath("//div[contains(text(),'Step 2: Fill Out Your Health Risk Assessment')]"));
//		Actions actions=new Actions(dr);
//		actions.moveToElement(HealthRiskAssesment).perform();
		mp.healthRiskAssessment();

		mp.healthRiskAssessment();
		//		WebElement SignUpFor = dr.findElement(By.xpath("//div[contains(text(),'Step 1: Sign Up for Our Member Portal')]"));
		//		Actions actions=new Actions(dr);
		//		actions.moveToElement(SignUpFor).perform();
		//		mp.healthRiskAssessment();
		//		
		////		//mp.signUpOurMemberPortal();
		//		Thread.sleep(3000);
		//	
		//		WebElement HealthRiskAssesment = dr.findElement(By.xpath("//div[contains(text(),'Step 2: Fill Out Your Health Risk Assessment')]"));
		//		Actions actions=new Actions(dr);
		//        actions.moveToElement(HealthRiskAssesment).perform();
		//mp.healthRiskAssessment();

		//dr.findElement(By.xpath("//div[text()='Step 2: Fill Out Your Health Risk Assessment']")).click();
		//		WebElement HealthRiskAssesment = dr.findElement(By.xpath("//div[text()='Step 2: Fill Out Your Health Risk Assessment']"));
		//	   Select select=new Select(HealthRiskAssesment);
		//		select.selectByVisibleText("Step 2: Fill Out Your Health Risk Assessment");		
		//		Actions actions=new Actions(dr);
		//		WebElement HealthRiskAssesment = dr.findElement(By.xpath("//div[contains(text(),'Step 2: Fill Out Your Health Risk Assessment')]"));
		//		actions.moveToElement(HealthRiskAssesment).perform();
		//	   //actions.moveToElement(HealthRiskAssesment).perform();
		//mp.switchWindow();
		//	 We//bElement HealthRiskAssesment = dr.findElement(By.xpath("//body/form[@id='Form']/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		//		actions.moveToElement(HealthRiskAssesment).perform();
		//		//mp.switchWindow();
		//		dr.findElement(By.xpath("//div[contains(text(),'Step 3: Review Your Plan Documents')]")).click();
		//		mp.switchWindow();
		//		dr.findElement(By.xpath("//div[contains(text(),'Step 4: Choose a Primary Care Provider')]")).click();
	}
	//@Test
	public void clickOnSignUpOurMemberPortal() {
		HomePage hp=new HomePage(dr);
		MemberPage mp=new MemberPage(dr);
		mp.signUpOurMemberPortal();


	}


}
