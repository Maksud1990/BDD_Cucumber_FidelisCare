package com.fidelis.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import com.fidelis.base.Base;
import com.fidelis.pages.HomePage;
import com.fidelis.pages.MemberPage;
import com.fidelis.utils.Utility;

public class HomePageTest extends Base {
	@Test
	public void varifyFidelisCareHomePageTitle() {
		String ehpt=dr.getTitle();
		String ahpt="Home";
		Utility.verify(ehpt, ahpt);

	}
	@Test
	public void verifyFidelisCareHomePageUrl() {

		String eurl=dr.getCurrentUrl();
		String aurl="https://www.fideliscare.org/";
		Utility.verify(eurl,aurl);
	}
	@Test
	public void varifyClickOnMemberButton() {
		HomePage hp=new HomePage(dr);
		hp.clickOnMemberButton();
		hp.switchWindow();
		hp.clickOnMembersButton();

	}
	
}
