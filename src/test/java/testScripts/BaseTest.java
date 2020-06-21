package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", "/Users/roshani/Desktop/Roshani-study/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://yahoo.com");
	}

	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}

