package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	public static Properties pro;

	public BaseTest() {

		pro = new Properties();
		FileReader file;
		try {
			file = new FileReader(System.getProperty("user.dir") + "./Resource/accountDetails.properties");
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void setUp()  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();

	}

}
