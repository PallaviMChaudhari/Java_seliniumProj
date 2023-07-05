package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollInViewStudy {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		
		WebElement popular_categories = driver.findElement(By.xpath("//h2[text()='Popular Categories']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", popular_categories);
		WebElement textBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",textBox);
		
		
		
	}

}
