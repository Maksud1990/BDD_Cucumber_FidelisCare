package com.fidelis.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberPage {
	WebDriver dr;

	public MemberPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);

	}
	public WebDriver switchWindow() {

		String firstwindow = dr.getWindowHandle();
		Set<String> windows = dr.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();

			dr.switchTo().window(window);
		}
		return dr;
	}
	public void switchWindowOne() {

		String firstwindow = dr.getWindowHandle();
		Set<String> windows = dr.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();

			dr.switchTo().window(window);
		}
		

	}
	
	@FindBy(xpath="//div[contains(text(),'Step 1: Sign Up for Our Member Portal')]")WebElement suomp;
	public void signUpOurMemberPortal() {
		suomp.click();
		
	}
	@FindBy(xpath="//div[contains(text(),'Step 2: Fill Out Your Health Risk Assessment')]")WebElement hra;
	public void healthRiskAssessment() {
		hra.click();
		
	}
	@FindBy(xpath="//div[contains(text(),'Step 3: Review Your Plan Documents')]")WebElement rypd;
	public void reviewYourPlanDocuments() {
		rypd.click();
		
	}
	@FindBy(xpath="//div[contains(text(),'Step 4: Choose a Primary Care Provider')]")WebElement cpcp;
	public void choosePrimaryCareProviders() {
		cpcp.click();
		
	}
@FindBy(xpath="//a[contains(text(),'Log In')]")WebElement loginBtn1;
public MemberOnlinePortalPage clickOnLoginButton1() {
	loginBtn1.click();
	return new MemberOnlinePortalPage(dr);
	
}	

}
