package study_POMForDribble;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	POM1 login;
	POM2 acc;
	
  @BeforeClass
  public void launch() {
	 lanuchBrowser();
	 Utility.impliciteWait(driver, 3000);
	 login=new POM1(driver);
	 acc=new POM2(driver);
	 
  }
  @BeforeMethod
  public void loginApp() throws InterruptedException, EncryptedDocumentException, IOException {
	  login.clickOnSignInButton();
	  Utility.threadTime(3000);
	  login.enterUserName();
	  Utility.threadTime(3000);
	  login.enterPassword();
	  Utility.threadTime(3000);
	  login.clickOnLoginButton();
	  Utility.threadTime(3000);
	  acc.clickOnProfile();
	  
	  
  }
  @Test
  public void dribbel() throws InterruptedException, EncryptedDocumentException, IOException {
	  Utility.threadTime(3000);
	  String act = acc.getUserName();
	  String exp = Utility.readDataFromExcel(0, 2);
	  Assert.assertEquals(act,exp,"tc fail bcoz string not matching.." );
	  Utility.takeScreenshot(driver, exp);
	  acc.clickOnPr(driver);
  }
  @AfterMethod
  public void logout() throws InterruptedException {
	 
	  
	 // Utility.threadTime(3000);
	 // acc.clickOnLogout();
	  
  }
  @AfterClass 
  public void closeAll() {
	  closeBrowser();
  }
}
