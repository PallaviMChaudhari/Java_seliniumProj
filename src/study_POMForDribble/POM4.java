package study_POMForDribble;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class POM4 {
	@FindBy(xpath = "(//a[@title='Open profile'])[1]")private WebElement profile;
	
	@FindBy(xpath = "//h1[text()='pallavi']")private WebElement userName;
	
	@FindBy(xpath = "(//a[@title='Open profile'])[1]")private WebElement pr;
	
	@FindBy(xpath = "//button[text()='Sign out']")private WebElement logout;

	public POM4(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickOnProfile() {
		Reporter.log("click on profile", true);
		profile.click();
	}
	
	public String getUserName() {
		String value = userName.getText();
		return value;
	}
	
	public void clickOnPr(WebDriver driver) {
		 Actions act=new Actions(driver);
		 act.moveToElement(pr).perform();
	}
	
	public void clickOnLogout() {
		Reporter.log("click on logout", true);
		logout.click();
	}

}
