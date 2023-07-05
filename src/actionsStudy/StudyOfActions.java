package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StudyOfActions {

	public static void main(String[] args) throws InterruptedException {
		//1.click
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement insuranceProjButton = driver.findElement(By.linkText("Insurance Project"));
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		
		act.click(insuranceProjButton).perform();
		
		
		
		
		
	}

}
