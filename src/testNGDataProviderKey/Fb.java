package testNGDataProviderKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb {
  @Test(dataProvider = "FbData",dataProviderClass =testNGDataProviderKey.DataProvideToFb.class )
  public void fbData(String name) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys(name);
  }
}
