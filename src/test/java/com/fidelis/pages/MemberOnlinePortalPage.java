package com.fidelis.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fidelis.pages.LoginPage;

public class MemberOnlinePortalPage {
	WebDriver dr;

	public MemberOnlinePortalPage(WebDriver dr) {
		this.dr = dr;
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

	@FindBy(xpath = "//input[@id='dnn_ctr5326_View_EntryKey']")
	WebElement enterkeyid;

	public LoginPage clickOnEnterKeyID() {
		enterkeyid.click();
		return new LoginPage(dr);
	}

}
