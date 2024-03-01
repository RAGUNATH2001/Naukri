package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import utility.WebEvent;

public class DashBoardPage extends BaseTest {

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@alt = \"Naukri Logo\"])[1]")
	WebElement toplogo;

	@FindBy(id = "login_Layer")
	WebElement loginButton;

	@FindBy(id = "register_Layer")
	WebElement registerButton;


	// Actions

	public void VerifyPageTitle() {
		String pagetitle = WebEvent.getTitle();
		System.out.println(pagetitle);
		assertEquals(pagetitle, "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
	}

	public void verifyLogo() {
		boolean status = WebEvent.verifyElementExist(toplogo);
		assertTrue(status);
	}
	
	public LoginPage clickOnLogin() {
		loginButton.click();
		return new LoginPage();
	}
	
	

}
