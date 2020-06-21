package pageClasses;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public boolean isLoginPageDisplayed() {
		try {
			if (driver.getTitle().contains("login")) {
				return true;
			}
		} catch (Exception e) {

		}
		return false;
	}

	public void doLogin(String userName) {
		// driver.findElement(By.cssSelector("#login-username")).sendKeys(arg0);
	}

}
