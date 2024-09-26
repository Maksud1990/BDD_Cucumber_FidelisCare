package com.fidelis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fidelis.pages.MemberPortalHome;

public class LoginPage {
	WebDriver dr;
	public LoginPage(WebDriver dr) {
		
	

		this.dr=dr;
		PageFactory.initElements(dr, this);
	}




	@FindBy(xpath="//input[@id='username']")WebElement emailaddres;
	
	public void OnEmailAddress() {
		emailaddres.sendKeys("mdrhmn7@yahoo.com");
	}
	@FindBy(xpath="//button[@id='nextButton']")WebElement continueButton;
	public void clickOnContinue() {
		continueButton.click();
	}

	@FindBy(xpath="//input[@id='username']")WebElement username;
	public void userName(String Username) {
		username.sendKeys("mdrhmn7@yahoo.com");
	}


	@FindBy(xpath="//input[@id='password']")WebElement password;
	public void clickOnPassword(String Password) {
		password.sendKeys("Maksud1976//");
	
	
	}
	@FindBy(xpath="//button[@id='btnSubmitLogin']")WebElement loginBtn3;
    public void clickOnLoginBtn3() {
    	loginBtn3.click();
    }
	
	
	
	@FindBy(xpath="//button[@id='loginButton']")WebElement loginbutton;
	public MemberPortalHome clickOnLoginButton() {
		loginbutton.click();
		return new MemberPortalHome(dr);
	}





}
