package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraEthic {
	
	@FindBy(xpath="//p[text()='M']")private WebElement dressSize;
	
	@FindBy(xpath="//div[text()='ADD TO BAG']")private WebElement addToBag;
	
	@FindBy(xpath="//span[text()='GO TO BAG']")private WebElement goToBag;
	
	@FindBy(xpath="//button[@class='css-etguer']")private WebElement placeOrder;
	
	public MyntraEthic(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnDressSize() {
		dressSize.click();
	}
	
	public void clickOnAddToBagButton() {
		addToBag.click();
	}
	
	public void clickOnGoToBagButton() {
		goToBag.click();
	}
	
	public void clickOnPlaceOrder() {
		placeOrder.click();
	}
 
}
