package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		driver.findElement(By.xpath("//ul[@class='resp-tabs-list ']//li[3]")).click();
		
		driver.switchTo().frame("globalSqa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='All']")).click();
		driver.findElement(By.xpath("//ul[@id='filter_list']//li[3]")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		for(int i=1;i<=8;i++) {
			WebElement value = driver.findElement(By.xpath("//div[@class='menu-widgets-container']//li["+i+"]"));
			System.out.println(value.getText());
		}
		driver.switchTo().frame("globalSqa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='facebook']")).click();
		

	}

}
