package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		
		Actions act=new Actions(driver);
		
		for(int i=1;i<=5;i++) {
		Thread.sleep(100);
		act.sendKeys(day,Keys.ARROW_UP).perform();
		}
		
		act.sendKeys(day, Keys.ENTER).perform();
	}

}
