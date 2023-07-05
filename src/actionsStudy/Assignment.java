package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//1.by using Web element method
		//rightClickButton.click();
		
		//2.by using Actions Class
		
		//Actions act=new Actions(driver);
		//act.contextClick(rightClickButton).perform();
		
		//3.by using javaScript Executor
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(10000);
		
		js.executeScript("arguments[0].click()",rightClickButton );
		
		
		
		
	}

}
