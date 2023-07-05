package testNGAssertStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudyBooleanAssert {
  //for true or false assert
  
  @Test
  public void a() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/login/");
	  driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  boolean radio = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
	  
	  Assert.assertTrue(radio,"TC fail becoz button is not selected");
  }
  
  @Test
  public void b() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/login/");
	  driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  boolean radio = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
	  
	  Assert.assertFalse(radio,"TC fail becoz button is selected");
  }
  
}
