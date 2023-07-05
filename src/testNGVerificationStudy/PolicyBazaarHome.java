package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarHome {
	
	//variable 
	@FindBy(xpath = "//a[text()='Sign in']") private WebElement signInButtonOnHomePage;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileNumField;
	
	@FindBy(xpath ="(//span[text()='Sign in with Password'])[2]") private WebElement loginWithPasswordButton;
	
	@FindBy(name = "password") private WebElement passwordField;
	
	@FindBy(xpath ="//span[text()='Sign in']") private WebElement signInButton; 
	
	@FindBy(xpath ="//div[text()='My Account']")private WebElement myAccountButton;
	
	@FindBy(xpath ="//span[text()= ' My profile ']") private WebElement myProfileButton;
	
	@FindBy(xpath = "//ul[@class='support-ui wd5']//li[4]")private WebElement logoutButton;
	
	
	
	public PolicyBazaarHome(WebDriver driver){
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
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}

}
