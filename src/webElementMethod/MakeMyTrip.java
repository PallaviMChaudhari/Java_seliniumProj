package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromCity.click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		driver.findElement(By.xpath("(//p[text()='Pune, India'])[2]")).click();
	     
		
		

	}

}
