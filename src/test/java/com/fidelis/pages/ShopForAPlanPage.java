package com.fidelis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopForAPlanPage {
  WebDriver dr;
	public ShopForAPlanPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}



    @FindBy(xpath="//div[contains(text(),'Medicaid Managed Care')]")WebElement medicaidMC;
    public void clickOnMedicaidManagedCare() {
    	medicaidMC.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Essential Plan')]")WebElement essentialPlan;
    public void clickOnEssentialPlan() {
    	essentialPlan.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Child Health Plus')]")WebElement childHealthPlus;
    public void clickOnChildHealthPlus() {
    	childHealthPlus.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Ambetter from Fidelis Care | Quality Health Plans')]")WebElement qHP;
    public void clickOnQHP() {
    	qHP.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'HealthierLife')]")WebElement healthierLife;
    public void clickOnHealthierLife() {
    	healthierLife.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Fidelis Care at Home')]")WebElement fidelisCareAtHome;
    public void clickOnFidelisCareAtHome() {
    	fidelisCareAtHome.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Medicare Advantage')]")WebElement medicareAdvantage;
    public void clickOnmedicareAdvantage() {
    	medicareAdvantage.click();
    
    }
    @FindBy(xpath="//div[contains(text(),'Dual Advantage')]")WebElement dualAdvantage;
    public void clickOnDualAdvantage() {
    	dualAdvantage.click();
    
    }
	}


