package com.fidelis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MemberPortalHome {
	 WebDriver dr;
		public MemberPortalHome(WebDriver dr) {
			this.dr=dr;
			PageFactory.initElements(dr, this);
			
		}

}
