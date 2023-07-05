package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement DropDown = driver.findElement(By.id("oldSelectMenu"));
		DropDown.click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		Actions act=new Actions(driver);
		
		for(int i=1;i<=2;i++) {
		Thread.sleep(1000);
		act.sendKeys(DropDown, Keys.ARROW_DOWN).perform();

		}
		Thread.sleep(5000);
		act.sendKeys(DropDown, Keys.ENTER).perform();
		
		
		
		
	}

}
