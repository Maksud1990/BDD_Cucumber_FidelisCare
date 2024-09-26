package com.fidelis.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fidelis.pages.MemberOnlinePortalPage;

public class HomePage {
	WebDriver dr;
	public  HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}



    @FindBy(xpath="//span[text()='Member']")WebElement memberButton;
    public void clickOnMemberButton() {
    	memberButton.click();
    
    }
   
   
	@FindBy(xpath="//body/form[@id='Form']/div[@id='header']/div[2]/div[3]")WebElement loginButton;
	public void clickOnLoginButton() {
		loginButton.click();
	}
	@FindBy(xpath="//body/form[@id='Form']/div[@id='header']/div[2]/div[3]/ul[1]/li[1]/a[1]/section[1]/h4[1]")WebElement memberaccess;
	public MemberOnlinePortalPage clickOnMemberAccess() {
		memberaccess.click();

		return new MemberOnlinePortalPage(dr);
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

	@FindBy(xpath="//a[@class='btn btn-primary' and text()='Members']")WebElement membersButton;
    public MemberPage clickOnMembersButton() {
    	membersButton.click();
    	
    	return new MemberPage(dr); 
    }
    
    

    @FindBy(xpath="//span[contains(text(),'Providers')]")WebElement providersBtn;
    public void clickOnProvidersBtn() {
    	providersBtn.click();
    
    }
    @FindBy(xpath="//body/form[@id='Form']/div[@id='megamenu']/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/a[1]")WebElement providersButton;
    public ProvidersPage clickOnProvidersButton() {
    	providersButton.click();
    	return new ProvidersPage(dr); 
    

}
    @FindBy(xpath="//span[contains(text(),'Shop For a Plan')]")WebElement shopForPlan;
    public void clickOnShopForAPalan() {
    	shopForPlan.click();
    	
   
    }

    @FindBy(xpath="//body/form[@id='Form']/div[@id='megamenu']/div[2]/div[1]/section[3]/div[1]/div[1]/div[1]/a[1]")WebElement shopforplan;
    public ShopForAPlanPage clickOnAgainShopForAPalan() {
    	shopforplan.click();
    	return new ShopForAPlanPage(dr); 
    }
}
