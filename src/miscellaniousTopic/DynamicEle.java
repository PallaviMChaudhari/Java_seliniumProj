package miscellaniousTopic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicEle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("lipstick");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(windowId);
		String mainPageId = al.get(0);
		String childPageId = al.get(1);
		
		driver.switchTo().window(childPageId);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement price = driver.findElement(By.xpath("//div[@class='pdp-price-info']//p[1]"));
		
		System.out.println(price.getText());
		
		driver.close();
		driver.switchTo().window(mainPageId);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.xpath("(//a[text()='Women'])[1]")).click();
		
		
		
	}

}
