package miscellaniousTopic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicListHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("fromCity")).sendKeys("pune");
		List<WebElement> cityList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(WebElement l:cityList) {
			String value = l.getText();
			System.out.println(value);
			
		}
		driver.findElement(By.xpath("//ul[@role='listbox']//li[3]//p")).click();
	}

}
