package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarProfilePg {
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement profileName;
	
	
	public PolicyBazaarProfilePg(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public String getProfiletext() {
		String actualText = profileName.getText();
		return actualText;
	}

}
