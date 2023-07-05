package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPage {
	@FindBy(xpath ="(//a[text()='Women'])[1]")private WebElement womenButton;
	
	@FindBy(xpath ="//input[@class='desktop-searchBar']")private WebElement searchBar;
	
	@FindBy(xpath ="//ul[@class='desktop-group']//li[2]")private WebElement liElement;
	
	@FindBy(xpath="(//a[@target='_blank'])[8]")private WebElement dress;
	
	
	public MyntraPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void clickOnWomenButton() {
		womenButton.click();
	}
	
	public void enterValueIntoSearchbar() {
		searchBar.sendKeys("kurta");
	}
	
	public void clickOnLiElement() {
		liElement.click();
	}
	

	public void clickOnDress() {
		dress.click();
	}

}
