package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement dragValue5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dragValueBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement amountField = driver.findElement(By.id("amt8"));
		WebElement debitAccountFeild = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		Actions act=new Actions(driver);
		
		act.scrollToElement(debitAccountFeild);
		
		act.dragAndDrop(dragValue5000,amountField ).perform();
		
		act.dragAndDrop(dragValueBank, debitAccountFeild).perform();
		
		act.clickAndHold(dragValue5000).moveToElement(amountField).release().build().perform();
	
		
		
		
		
	}

}
