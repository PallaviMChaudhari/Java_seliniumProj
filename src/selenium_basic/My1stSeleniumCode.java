package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class My1stSeleniumCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9405888174");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		driver.close();
	}

}
