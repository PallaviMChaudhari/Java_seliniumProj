package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartCompare {
	@FindBy(xpath = "(//div[text()='Choose a Product'])[1]")private WebElement product; 
	@FindBy(xpath = "(//div[text()='Choose Brand'])[1]")private WebElement brandName;
	
	
	public FlipkartCompare(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterBrandName(String brand) {
		brandName.sendKeys(brand);
	}
	
	public void enterProductValue(String pName){
		product.sendKeys(pName);
	}
	
	

}
