package study_POMForDribble;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	static WebDriver driver;
	  public void lanuchBrowser() {
		  driver=new ChromeDriver();
		  Reporter.log("browser lanuch..", true);
		  driver.get("https://dribbble.com/");
		  driver.manage().window().maximize();
	  }
	  
	  public void closeBrowser() {
		  driver.quit();
	  }
	  
	  public void lanuchBrowserByProperties() throws IOException {
		  driver=new ChromeDriver();
		  driver.get(Utility.readDataFromProperty("Url"));
	  }
	

}
