package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlipkartHome {
	@FindBy(xpath = "//button[text()='✕']")private WebElement popUPHandle;
	@FindBy(name = "q")private WebElement searchBar;
	@FindBy(xpath = "//button[@type='submit']") private WebElement searchButton;
	@FindBy(xpath = "(//div[@class='_24_Dny'])[13]")private WebElement addCompare;
	@FindBy(xpath = "//span[text()='COMPARE']")private WebElement compare;
	
	public FlipkartHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void handlePopupClick() {
		popUPHandle.click();
	}
	public void enterValueInSerchbar(String mName) {
		searchBar.sendKeys(mName);
	}
	
	public void clickONSearchButton() {
		searchButton.click();
	}
	public void clickOnCompare() {
		addCompare.click();
	}
	public void clickOnCompareButton() {
		compare.click();
		
	}
	
	

}
