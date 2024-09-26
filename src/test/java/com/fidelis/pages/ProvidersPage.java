package com.fidelis.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvidersPage {
WebDriver dr;
	public ProvidersPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	




    @FindBy(xpath="//a[contains(text(),'Log In')]")WebElement loginBtn2;
    public LoginPage clickOnLoginBtn2() {
    	loginBtn2.click();
    	return new LoginPage(dr);
    
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
}
