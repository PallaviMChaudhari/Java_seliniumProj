package testNGCrossBrowser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import commonMethod.CMethod;

public class CrossBrowsertesting {
	@Parameters("browserName")
  @Test
  public void cbTest(String bName) {
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
	 
	  
	  
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.policybazaar.com/?");
		CMethod.impliciteWait(driver, 5000);
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//insert value in to user id field n click on sign in with pass
		
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9405888174");
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		CMethod.impliciteWait(driver, 5000);
		
		//insert pass n click on sign in button
		driver.findElement(By.name("password")).sendKeys("pallu12345");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		//click on my account button
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		
		//click on my profile 
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> WindowId = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(WindowId);
		//String mainPageId = al.get(0);
		String childPageId = al.get(1);
		
		//change focus from main page to child page 
		driver.switchTo().window(childPageId);
		CMethod.impliciteWait(driver, 5000);
		
		String expectedText="Pallavi Chaudhari";
		String actualText = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
		
		System.out.println(actualText);
	    if(expectedText.equals(actualText)) {
	    	System.out.println("Test case is pass");
	    	
	    }
	    else {
	    	System.out.println("Test case is fail");
	    }
	    
  }
}
