package testScripts;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageClasses.BasePage;
import pageClasses.LoginPage;

public class LoginTest extends BaseTest{
	
	boolean result;
	BasePage basePage;
	LoginPage loginPage;

	@Test
	public void loginTest(){
		basePage = new BasePage(driver);
		result = basePage.goToLoginPage().isLoginPageDisplayed();
		AssertJUnit.assertTrue(result);
		
	}
}
