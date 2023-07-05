package testNGAssertStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudyNullAssert {
  @Test
  public void fb() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  String pass = driver.findElement(By.xpath("//input[@type='password']")).getText();
	  System.out.println("value is :"+pass+"...");
	  
	  Assert.assertNotNull(pass, "TC fail bcoze value is null");
  }
  @Test
  public void a() {
	  String p=null;
	  Assert.assertNull(p,"tc fail bcoz value is not null");
	  //Assert.assertNotNull(p, "TC fail becoze value is null");
  }
}
