package study_POMForDribble;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class POM3 {
	@FindBy(xpath = "(//a[text()='Log in'])[2]")private WebElement signInButton;
	
	@FindBy(id = "login")private WebElement userName; 
	
	@FindBy(id = "password")private WebElement password;
	
	@FindBy(xpath = "//input[@value='Sign In']")private WebElement loginButton;
	
	public POM3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignInButton() {
		Reporter.log("click on sign in", true);
		signInButton.click();
	}
	
	public void enterUserName(String uName) throws EncryptedDocumentException, IOException {
		userName.sendKeys(uName);
	}
	
	public void enterPassword(String pwd) throws EncryptedDocumentException, IOException {
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		Reporter.log("click on login button ", true);
		loginButton.click();
	}
	

}
