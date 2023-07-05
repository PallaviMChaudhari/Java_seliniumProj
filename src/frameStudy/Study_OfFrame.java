package frameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study_OfFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("menuButton")).click();
		driver.findElement(By.xpath("//span[text()='Change Theme, Dark/Light']")).click();
		

		
	}

}
