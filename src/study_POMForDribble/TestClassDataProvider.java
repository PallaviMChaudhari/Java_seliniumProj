package study_POMForDribble;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;   
import org.testng.annotations.Test;

public class TestClassDataProvider extends BaseClass {
	
	POM3 login;
	POM4 acc;
	
  @BeforeClass
  public void launch() {
	 lanuchBrowser();
	 Utility.impliciteWait(driver, 3000);
	 login=new POM3(driver);
	 acc=new POM4(driver);
	 
  }
  
  @Test(dataProvider = "dribbleData",dataProviderClass = study_POMForDribble.DataProvide.class)
  public void dribbel(String uName,String pwd,String user) throws InterruptedException, EncryptedDocumentException, IOException {
	  login.clickOnSignInButton();
	  Utility.threadTime(3000);
	  login.enterUserName(uName);
	  Utility.threadTime(3000);
	  login.enterPassword(pwd);
	  Utility.threadTime(3000);
	  login.clickOnLoginButton();
	  Utility.threadTime(3000);
	  acc.clickOnProfile();
	  Utility.threadTime(3000);
	  String act = acc.getUserName();
	  String exp = user;
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
