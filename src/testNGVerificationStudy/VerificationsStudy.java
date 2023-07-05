package testNGVerificationStudy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerificationsStudy {
  WebDriver driver;
  PolicyBazaarHome p;
  PolicyBazaarProfilePg pp;
  @BeforeClass
  public void launchPolicyBazzar() {
	  driver=new ChromeDriver();
	  driver.get("https://www.policybazaar.com/?");
	  driver.manage().window().maximize(); 
	  
  }
  @BeforeMethod
  public void loginIntoPolicyBazzar() throws InterruptedException {
	  p=new PolicyBazaarHome(driver);
	  p.clickOnSignInButtonOnHomePage();
	  Thread.sleep(5000);
	  p.enterInMobileNumFeild("9405888174");
	  Thread.sleep(5000);
	  p.clickOnLoginWithPasswordField();
	  Thread.sleep(5000);
	  p.enterPasswordIntoPassField("pallu12345");
	  Thread.sleep(5000);
	  p.clickOnSignInButton();
	  Thread.sleep(5000);
	  p.clickOnMyAccountButton();
	  Thread.sleep(600);
	  p.clickOnMyProfileButton();
	  
	  
  }
  @Test
  public void testing() {
	  Set<String> allId = driver.getWindowHandles();
	  ArrayList<String> al=new ArrayList<>(allId);
	  String mainPageId = al.get(0);
	  String childPageId = al.get(1);
	  driver.switchTo().window(childPageId);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  String expected="Pallavi Chaudhari";
	  pp=new PolicyBazaarProfilePg(driver);
	  String a = pp.getProfiletext();
	  Assert.assertEquals(expected,a,"TC Fail" );
	  
	  driver.close();
	  driver.switchTo().window(mainPageId);
	 
	  
  }
  @AfterMethod
  public void logoutFromPolicybazaar() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  p.clickOnMyAccountButton();
	  Thread.sleep(500);
	  p.clickOnLogoutButton();   
  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
	  
  }
}
