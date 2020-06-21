package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;

	@Test
	public void beforeTest() throws MalformedURLException{
//		System.setProperty("webdriver.chrome.driver", "/Users/roshani/Desktop/Roshani-study/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("http://yahoo.com");
		
		DesiredCapabilities ds = DesiredCapabilities.chrome();
		ds.acceptInsecureCerts();
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(ds);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), co);
		driver.get("http://yahoo.com");
	}

//	@AfterTest
//	public void afterTest(){
//	   driver.quit();
//	}
}

