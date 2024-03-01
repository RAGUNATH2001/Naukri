package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import utility.WebEvent;

public class LoginPage extends BaseTest {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Enter your active Email ID / Username\"]")
	WebElement Username;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[.=\"Login\"]")
	WebElement loginButton;
	
	//Action 
	
	public void typeUsername() {
		
		WebEvent.implicitywait(60);
	    WebEvent.javascriptclick(Username);
	    WebEvent.typeText(Username, pro.getProperty("username"));
	    
	}

	public void typepassword() {
		WebEvent.implicitywait(60);
	    WebEvent.javascriptclick(password);
	    WebEvent.typeText(password, pro.getProperty("password"));
	}
	
	public HomePage clickOnLoginButton() {
		WebEvent.clickOnElement(loginButton);
		return new HomePage();
	}

}
