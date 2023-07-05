   package popUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.name("alert")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.dismiss();
		driver.findElement(By.name("confirmation")).click();
		Alert alt1 = driver.switchTo().alert();
		String a = alt1.getText();
		System.out.println(a);
		Thread.sleep(3000);
		alt1.accept();
		driver.findElement(By.name("prompt")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("hii");
		Thread.sleep(3000);
		alt2.accept();
		
	}

}
