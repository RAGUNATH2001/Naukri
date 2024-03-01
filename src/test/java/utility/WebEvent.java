package utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseTest;

public class WebEvent extends BaseTest {

	public static String getTitle() {

		return driver.getTitle();

	}

	public static boolean verifyElementExist(WebElement toplogo) {
		return toplogo.isDisplayed();
	}

	public static void clickOnElement(WebElement ele) {
		ele.click();

	}

	public static void typeText(WebElement ele, String value) {
		ele.clear();
		ele.sendKeys(value);

	}

	public static void implicitywait(int num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(num));
	}

	public static void javascriptclick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	public static void ctrlA() {
		Actions sc = new Actions(driver);
		sc.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	}
	
	public static void deleteKey() {
		Actions sc = new Actions(driver);
		sc.sendKeys(Keys.DELETE);
	}
	public static String getText(WebElement ele) {
		return ele.getText();
		
	}

}
