package testNGVerificationStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassForDemoQa {
  WebDriver driver=null;
  DemoQaLogin login;
  BookStorePage book;
	
  @BeforeClass
  public void launchApp() {
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
	  
  }
  
  @BeforeMethod
  public void loginIntoApp() throws InterruptedException {
  login=new DemoQaLogin(driver);
  login.enterUserName();
  Thread.sleep(5000);
  login.enterPassword();
  Thread.sleep(7000);
  login.clickOnLogin();
  Thread.sleep(7000);
  
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
  book=new BookStorePage(driver);
  //book.clickONBookStoreApp();
  Thread.sleep(7000);
  book.clickOnBookStoreButton();
  Thread.sleep(5000);
  book.clickOnBook();
  
  
  }
 
  @Test
  public void testBookName (){
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  String ExpTitle ="Learning JavaScript Design Patterns";
	  String ActulTitle = book.titleNameIs();
	  System.out.println(ActulTitle);
	  Assert.assertEquals(ActulTitle,ExpTitle,"Tc Fail due to String not same");
  }
  @Test
  public void testAuthorName() {
	  String expAuthore="Addy Osmani";
	  String actAuthor = book.getAuthorName();
	  System.out.println(actAuthor);
	  Assert.assertEquals(actAuthor, expAuthore,"Tc Fail due to String not same");
  }
  
  @AfterMethod
  public void logoutFromApp() throws InterruptedException {
	  Thread.sleep(5000);
	  book.clickOnLogoutButton();
	  
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	 Thread.sleep(4000);
	 driver.quit();
  }
}
