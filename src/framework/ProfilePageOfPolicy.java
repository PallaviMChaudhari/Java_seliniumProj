package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageOfPolicy {
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement profileName;
	
	
	public ProfilePageOfPolicy(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void getProfiletext(String expectedText) {
		String actualText = profileName.getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("test case is pass");
			
		}
		else {
			System.out.println("test case is fail");
		}
	}

}
