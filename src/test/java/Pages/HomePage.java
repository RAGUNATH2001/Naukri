package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import utility.WebEvent;

public class HomePage extends BaseTest {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"view-profile-wrapper\"]/a")
	WebElement viewProfile;
	
	@FindBy(xpath = "//em[.=\"editOneTheme\"]")
	WebElement profileEdit;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Your Name\"]")
	WebElement editname;
	
	@FindBy(id="saveBasicDetailsBtn")
	WebElement saveprofileEdit;
	
	@FindBy(xpath = "//input[@id=\"mob_number\"]")
	WebElement editPhoneNumber;
	
	@FindBy(xpath = "//span[@class =\"fullname\"]")
	WebElement profileName;

	public void verifyHomeTitle() {
		String hometitle = WebEvent.getTitle();
		assertEquals(hometitle, "Home | Mynaukri");
	}

	public void clickOnViewProfile() {

		WebEvent.clickOnElement(viewProfile);

	}
	
	public void clickOnProfileEditIcon() {
		WebEvent.clickOnElement(profileEdit);
		
	}
	
	
	
	public void editnameSection() {
		WebEvent.implicitywait(2);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebEvent.javascriptclick(editname);
		WebEvent.clickOnElement(editname);
		WebEvent.ctrlA();
		WebEvent.deleteKey();
		WebEvent.typeText(editname,pro.getProperty("editFirstname"));
	}
	
	public void editPhoneNumber() {
		WebEvent.implicitywait(2);
		WebEvent.javascriptclick(editPhoneNumber);
		WebEvent.clickOnElement(editPhoneNumber);
		WebEvent.ctrlA();
		WebEvent.deleteKey();
		WebEvent.typeText(editPhoneNumber,pro.getProperty("editphonenumber"));
	}
	
	public void clickOnSaveInEditeProfile() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", saveprofileEdit);
	    WebEvent.clickOnElement(saveprofileEdit);
	}
	
	public void VerifyProfileName() {
		
		String name = WebEvent.getText(profileName);
		assertEquals(name,pro.getProperty("editname"));
		
	}
}
