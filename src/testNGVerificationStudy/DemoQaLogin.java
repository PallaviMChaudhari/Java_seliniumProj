package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaLogin {
	@FindBy(xpath = "//input[@id='userName']")private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")private WebElement loginButton;
	
	public DemoQaLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterUserName() {
		userName.sendKeys("pallavichaudhari");
	}
	
	public void enterPassword() {
		password.sendKeys("Pallu@12345");
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}

}
