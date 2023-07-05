package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		Actions act=new Actions(driver);
		
		for(int i=1;i<=4;i++) {
			Thread.sleep(500);
			act.sendKeys(month, Keys.ARROW_DOWN).perform();
				
		}
		Thread.sleep(500);
	    act.sendKeys(month, Keys.ENTER).perform();

	}

}
