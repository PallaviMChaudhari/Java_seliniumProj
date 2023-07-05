package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomStudy {
	
	//variable 
	@FindBy(xpath = "//a[text()='Sign in']") private WebElement signInButtonOnHomePage;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileNumField;
	
	@FindBy(xpath ="(//span[text()='Sign in with Password'])[2]") private WebElement loginWithPasswordButton;
	
	@FindBy(name = "password") private WebElement passwordField;
	
	@FindBy(xpath ="//span[text()='Sign in']") private WebElement signInButton; 
	
	@FindBy(xpath ="//div[text()='My Account']")private WebElement myAccountButton;
	
	@FindBy(xpath ="//span[text()= ' My profile ']") private WebElement myProfileButton;
	
	
	
	
	
	public PomStudy(WebDriver driver){
		PageFactory.initElements(driver,this);
			
	}
	
	//method
	
	public void clickOnSignInButtonOnHomePage() {
		signInButtonOnHomePage.click();
	}
	
	public void enterInMobileNumFeild(String UserId) {
		mobileNumField.sendKeys(UserId);
		
	}
	
	public void clickOnLoginWithPasswordField() {
		loginWithPasswordButton.click();
	}
	
	public void enterPasswordIntoPassField(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void clickOnSignInButton() {
		signInButton.click();
		
	}
	
	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}
	
	public void clickOnMyProfileButton() {
		myProfileButton.click();
	}

}
