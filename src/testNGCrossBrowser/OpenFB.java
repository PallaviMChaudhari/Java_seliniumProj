package testNGCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenFB {
  @Parameters("browserName")
  @Test
  public void fb(String bName) {
	  WebDriver driver=null;
	  if(bName.equals("chrome")) {
		  driver=new ChromeDriver();  
	  }
	  else if(bName.equals("firefox")) {
		  driver=new FirefoxDriver();
	  }
	  else if(bName.equals("edge")) {
		  driver=new EdgeDriver();
		  
	  }
	    
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize(); 
	  
	  
  }
}
