package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartStudy {
  @BeforeClass	
  public void lanuchBrowserNApp() {
	  System.out.println("Browser lanuch successfully n application start in browser ");
	  
  }
	
  @BeforeMethod 
  public void searchProduct(){
	  System.out.println("Product list generate...");
	  
  }	
  @Test(priority=-2)
  public void moveToWishlist() {
	  Reporter.log("product successfully add in to wishlist", true);
  }
  @Test
  public void buyProduct() {
	  System.out.println("buy product directly");
	  
  }
  @Test(priority = -1)
  public void addToCart() {
	  System.out.println("Product added succesfully...");
	  
  }
  @AfterMethod()
  public void logInApp() {
	  System.out.println("login in to app...");
  }
  @AfterMethod
  public void logoutApp(){
	  System.out.println("Account logoutsuccessfully");
  }
  @AfterClass
  public void closeBrowser() {
	  System.out.println("browser is close");
  }
}
