package testNG_CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
  WebDriver driver=null;
  @Parameters("bName")
  @Test
  public void fb(String bName) {
	  if(bName.equals("chrome")) {
		  driver=new ChromeDriver();
		  
	  }
	  else if(bName.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  
  }
}
