package testNGCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBrowserStudy {
  @Parameters("BrowName")
  
  @Test
  public void openInsta(String bName) {
	  WebDriver driver=null;
	  if(bName.equals("chrome")) {
		  driver=new ChromeDriver();
	  }
	  else if(bName.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
	  
	  
  }
}
