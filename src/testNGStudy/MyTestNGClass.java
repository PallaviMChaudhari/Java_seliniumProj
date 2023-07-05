package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestNGClass {
  @BeforeClass
  public void browser() {

	  Reporter.log("browser launch n start app", true);
  }
  @BeforeMethod
  public void login() {

	  Reporter.log("login successful", true);  
  }
  
  @Test(priority = -1,timeOut = 5000)
  public void sendMsg() {
	  Reporter.log("msg send", true);
  }
  @Test(dependsOnMethods = "changeStatus")
  public void chngProfile() {

	  Reporter.log("change profile", true);
  }
  @Test(invocationCount = 2)
  public void changeStatus() {

	  Reporter.log("change status", true);
  }
  
  @AfterMethod
  public void logout() {

	  Reporter.log("logout successful", true);
  }
  @AfterClass
  public void closeBrowser() {

	  Reporter.log("close browser", true);
  }
}
