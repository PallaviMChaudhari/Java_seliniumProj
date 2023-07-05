package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement input = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		input.click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8830675450");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("556562");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//driver.findElement(By.xpath("(//a[text()='Mobiles'])[2]")).click();
		driver.close();
		
	}

}
