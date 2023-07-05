package testNGDataProviderKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StudyOfDataProvider {
  @Test(dataProvider = "dataGive",dataProviderClass = FbDataProvider.class)
  public void fbInfo(String UName,String LName,String MNo) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  driver.findElement(By.name("firstname")).sendKeys(UName);
	  Thread.sleep(500);
	  driver.findElement(By.name("lastname")).sendKeys(LName);
	  Thread.sleep(500);
	  driver.findElement(By.name("reg_email__") ).sendKeys(MNo);
  }
}
