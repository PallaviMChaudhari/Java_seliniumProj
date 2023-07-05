package testNGVerificationStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassForFlipkart {
  WebDriver driver=null;
  FlipkartHome home;
  FlipkartCompare comp;
  
  @BeforeClass
  public void launchApp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  
	  
  }
  @BeforeMethod
  public void a() throws InterruptedException {
	  
	  home=new FlipkartHome(driver);
	  home.handlePopupClick();
	  home.enterValueInSerchbar("iphone 14");
	  Thread.sleep(4000);
	  home.clickONSearchButton();
	  Thread.sleep(4000);
	  home.clickOnCompare();
	  Thread.sleep(4000);
	  home.clickOnCompareButton();
	  Thread.sleep(4000);
	  comp.enterBrandName("samsung");
	  Thread.sleep(4000);
	  comp.enterProductValue("SAMSUNG Galaxy F14 5G");
	 
	  
	  
	  
  }
  @Test
  public void f() {
  }
}
