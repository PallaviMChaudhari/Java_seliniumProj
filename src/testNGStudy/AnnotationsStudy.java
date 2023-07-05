package testNGStudy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @BeforeClass
  public void lanuchBrowser() {
	  System.out.println("Browser is lanuch successfully and start application in browser");
  }
	
  @BeforeMethod
  public void loginToFacebook() {
	  System.out.println("User login into facebook Successfully...");
  }
	
  @Test
  public void sendMessage() {
	  System.out.println("Message is sending...");
	    
  }
  @Test
  public void changeProfile() {
	  System.out.println("Profile picture is change successfully..");
  }
  @Test
  public void addStatus() {
	  System.out.println("Status upload successfully...");
  }
  
  @AfterMethod
  public void logoutAccount() {
	  System.out.println("You are logout from facebook..");
  }
  
  @AfterClass
  public void closeBrowser() {
	  System.out.println("Browser is close");
  }
}
