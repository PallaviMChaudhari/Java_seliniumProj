package testNGVerificationStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage {
	@FindBy(xpath = "(//div[@class='header-text'])[6]")private WebElement bookStoreAppButton;
	
	@FindBy(xpath = "(//li[@id='item-2'])[5]")private WebElement bookStoreButton;
	
	@FindBy(linkText = "Learning JavaScript Design Patterns")private WebElement bookName;
	
	@FindBy(xpath = "//label[text()='Learning JavaScript Design Patterns']")private WebElement titleName;
	
	@FindBy(xpath = "(//label[@id='userName-value'])[5]")private WebElement authorName;
	
	@FindBy(xpath = "//button[text()='Log out']")private WebElement logoutButton;
	
	public BookStorePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public void clickONBookStoreApp() {
		bookStoreAppButton.click();
	}
	
	public void clickOnBookStoreButton() {
		bookStoreButton.click();
	}
	
	public void clickOnBook() {
		bookName.click();
	}
	
	public String titleNameIs() {
		String actTitle = titleName.getText();
		return actTitle;
	}
	
	public String getAuthorName() {
		String actAuthorName = authorName.getText();
		return actAuthorName;
	}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}

}
