package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DashBoardPage;
import Pages.HomePage;
import Pages.LoginPage;

public class UpdateProfile extends BaseTest {
	
	


	DashBoardPage dashobj ; 
	LoginPage loginobj;
	HomePage homeobj;
	
	@BeforeMethod
	public void initlization() throws IOException {
		
		setUp();
		 dashobj = new DashBoardPage();
		 loginobj =  new LoginPage();
		 homeobj = new HomePage();
		
	}
	
	
	@Test
	public void verify() {
		
		dashobj.VerifyPageTitle();
		dashobj.verifyLogo();
		dashobj.clickOnLogin()
		.typeUsername();
		loginobj.typepassword();
		loginobj.clickOnLoginButton();
		homeobj.clickOnViewProfile();
		homeobj.clickOnProfileEditIcon();
		homeobj.editnameSection();
		homeobj.editPhoneNumber();
		homeobj.clickOnSaveInEditeProfile();
		
	//	homeobj.VerifyProfileName();
		
	}
	
	
	
	
	
	
	

}

