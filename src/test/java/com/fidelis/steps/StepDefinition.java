package com.fidelis.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.fidelis.utils.Utility;
import com.fidelis.base.Browser;
import com.fidelis.base.FileReading;
import com.fidelis.pages.HomePage;
import com.fidelis.pages.LoginPage;

import com.fidelis.pages.MemberPortalHome;
import com.fidelis.pages.ProvidersPage;
import com.fidelis.pages.ShopForAPlanPage;
import com.fidelis.pages.MemberOnlinePortalPage;
import com.fidelis.pages.MemberPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	Properties pr = FileReading.readFromProperties("src\\main\\resources\\File.properties");	
	WebDriver dr;
	HomePage hp;
	MemberOnlinePortalPage mop;
	 MemberPortalHome mph;
    LoginPage lp;
	
	@Given("I have to open chrome browser")
	public void i_have_to_open_chrome_browser() {
	dr=Browser.openBrowser((String) pr.get("chromeBrowser"));   
	}
	@Then("I verify the title")
	public void i_verify_the_title() {
		String ehpt=dr.getTitle();
		String ahpt="Home";
		Utility.verify(ehpt, ahpt);
	   
	}

	@When("I am on FidelisCare home page")
	public void i_am_on_FidelisCare_home_page() {
		dr.get((String) pr.get("url"));   
	}

	@And("I click on member login button")
	public void i_click_on_member_login_button() {
		hp=new HomePage(dr);
		hp.clickOnLoginButton();  
	}

	@And("Click on member access online")
	public void click_on_member_access_online() {
		hp=new HomePage(dr);

		hp.clickOnMemberAccess();
	}

	@Then("I verify the member page title")
	public void i_verify_the_member_page_title() {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);

		String eppt=dr.getTitle();
		String appt="Home";
		Utility.verify(eppt, appt);
	   
	}

	@And("Click on EnterKeyID button")
	public void click_on_EnterKeyID_button() {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		mop.switchWindow();
		mop.clickOnEnterKeyID();
	}

	@And("Type on email address")
	public void type_on_email_address() throws InterruptedException {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		Thread.sleep(4000);
		lp.OnEmailAddress();

	}

	@And("Click on continue button")
	public void click_on_continue_button() {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		lp.clickOnContinue();
	}

	@And("I enter username as {string}")
	public void i_enter_username_as(String string) {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		lp.userName("mdrhmn7@yahoo.com");

	}

	@And("I enter password as {string}")
	public void i_enter_password_as(String string) {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		lp.clickOnPassword("Maksud1976//");
	}

	@When("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		mph=new MemberPortalHome(dr);
		
		Thread.sleep(4000);
		lp.clickOnLoginButton();
	}
	@When("Now I have to type username as {string}")
	public void now_I_have_to_type_username_as(String username ) {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		lp.userName("username");

	}

	@When("Next I have to type password as {string}")
	public void next_I_have_to_type_password_as(String password) {
		hp=new HomePage(dr);
		mop=new MemberOnlinePortalPage(dr);
		lp=new LoginPage(dr);
		lp.clickOnPassword("password");
	}

	@Then("I should be able to see the member portal home page")
	public void i_should_be_able_to_see_the_member_portal_home_page() {
	   
	}

	@And("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}

@And("I click on member button")
public void i_click_on_member_button() {
	HomePage hp=new HomePage(dr);
	hp.clickOnMemberButton();
	hp.switchWindow();
    
}

@And("I click on member and members button")
public void i_click_on_member_and_members_button() {
	HomePage hp=new HomePage(dr);
	
	
	hp.clickOnMemberButton();
	hp.switchWindow();
	hp.clickOnMembersButton();
	String eMemberpt=dr.getTitle();
	String aMemberpt="Member";

	Utility.verify(eMemberpt, aMemberpt);
    
}

@And("I click on SUOMP button")
public void i_click_on_SUOMP_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	MemberPage mp=new MemberPage(dr);
	Thread.sleep(3000);
	mp.signUpOurMemberPortal();
    
}

@And("I click on HRA button")
public void i_click_on_HRA_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	MemberPage mp=new MemberPage(dr);
	Thread.sleep(3000);
	mp.healthRiskAssessment();
   
}

@And("I click on RYPD button")
public void i_click_on_RYPD_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	MemberPage mp=new MemberPage(dr);
	Thread.sleep(3000);
	mp.reviewYourPlanDocuments();
   
}

@And("I click on PCB button")
public void i_click_on_PCB_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	MemberPage mp=new MemberPage(dr);
	Thread.sleep(3000);
	mp.choosePrimaryCareProviders();
} 

@And("I click On Login button1")
public void i_click_On_Login_button1() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	MemberPage mp=new MemberPage(dr);
	Thread.sleep(3000);
	mp.clickOnLoginButton1();
  
}

@And("I click on Providers and providers button")
public void i_click_on_Providers_and_providers_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	hp.clickOnProvidersBtn();
	hp.switchWindow();
	Thread.sleep(2000);
	hp.clickOnProvidersButton();
    
}


@And("click on login btn2")
public void click_on_login_btn2() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ProvidersPage pp=new ProvidersPage(dr);
	Thread.sleep(2000);
	pp.clickOnLoginBtn2();
	hp.switchWindow();
    
}

//@Then("click on username1")
//public void click_on_username1() throws InterruptedException {
//	HomePage hp=new HomePage(dr);
//	ProvidersPage pp=new ProvidersPage(dr);
//	LoginPage1 lp1=new LoginPage1();
//	Thread.sleep(2000);
//	lp1.clickOnUserName1();
//   
//}
//
//@And("click on password1")
//public void click_on_password1() throws InterruptedException {
//	HomePage hp=new HomePage(dr);
//	ProvidersPage pp=new ProvidersPage(dr);
//	LoginPage1 lp1=new LoginPage1();
//	Thread.sleep(2000);
//	lp1.clickOnPassword1();
//}

@And("click on login btn3")
public void click_on_login_btn3() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ProvidersPage pp=new ProvidersPage(dr);
	LoginPage lp=new LoginPage(dr);
	Thread.sleep(2000);
	lp.clickOnLoginBtn3();
   
}

@When("I click on shop for a plan button and again plan button")
public void i_click_on_shop_for_a_plan_button_and_again_plan_button() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	hp.clickOnShopForAPalan();
	hp.switchWindow();
	Thread.sleep(2000);
	hp.clickOnAgainShopForAPalan();
   
}

@When("click on medicaid managed care")
public void click_on_medicaid_managed_care() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnMedicaidManagedCare();
    
}

@When("click on essential plan")
public void click_on_essential_plan() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
    hfpp.clickOnEssentialPlan();
}

@When("click on child health plus")
public void click_on_child_health_plus() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnChildHealthPlus();
}

@When("click on quality health plan")
public void click_on_quality_health_plan() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnQHP();
}

@When("click on healtheire life")
public void click_on_healtheire_life() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnHealthierLife();
}

@When("click on fidelis care at home")
public void click_on_fidelis_care_at_home() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnFidelisCareAtHome();
}

@When("click on medicare advantage")
public void click_on_medicare_advantage() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnmedicareAdvantage();
}

@When("click on dual advantage")
public void click_on_dual_advantage() throws InterruptedException {
	HomePage hp=new HomePage(dr);
	ShopForAPlanPage hfpp=new ShopForAPlanPage(dr);
	Thread.sleep(2000);
	hfpp.clickOnDualAdvantage();
   
}













}
