package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement engLangLink = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(5000);
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", engLangLink);
		driver.findElement(By.xpath("//ul[@class='uiList localeSelectorList _2pid _509- _4ki _6-h _6-j _6-i']//li[5]")).click();
	}

}
