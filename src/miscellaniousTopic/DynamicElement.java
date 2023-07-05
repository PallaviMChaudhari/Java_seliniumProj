package miscellaniousTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[4]"));
		
		System.out.println(rating.getText());
		
	    

	}

}
