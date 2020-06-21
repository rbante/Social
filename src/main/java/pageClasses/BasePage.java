package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver= driver;
	}
	
	public LoginPage goToLoginPage(){
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		return new LoginPage(driver);
	}
}
