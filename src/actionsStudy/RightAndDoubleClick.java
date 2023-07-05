package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		
		//act.contextClick(rightClickButton).perform();
		
		//act.moveToElement(rightClickButton).perform();
		//act.contextClick().perform();
		
		act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//act.doubleClick(doubleClickButton).perform();
		
		//act.moveToElement(doubleClickButton).perform();
		//act.doubleClick();
		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
	}

}
