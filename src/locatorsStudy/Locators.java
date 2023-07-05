package locatorsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//1.by using name locators syntax--->By.name("value of name")
		driver.findElement(By.name("email")).sendKeys("pallavi");
		
		//2.by using id locators syntax--->By.id("value of id")
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		//3. Locator-->Class By.clssName("value of class without space");
		//make sure there is no space in classname.
		// if there is space in classname, use only the value where there is no space
		
		//driver.findElement(By.className("selected")).click();
		
		//4.Locator-->linked text --->By.linkedText("text written on of link ");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//5.Locator-->partial linked text()--->by.partialLink Text("value of partial text written on link")
		
		driver.findElement(By.partialLinkText("account?")).click();
		driver.quit();
	}

}
