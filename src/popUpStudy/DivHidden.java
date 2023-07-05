 package popUpStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DivHidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> AllPageId = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(AllPageId);
		String mainPageId = al.get(0);
		String childPageId = al.get(1);
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		driver.findElement(By.name("emailid")).sendKeys("pallavi@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		driver.switchTo().window(mainPageId);
		String a = driver.findElement(By.tagName("h2")).getText();
		System.out.println(a);
		Thread.sleep(3000);
		
		
	}

}
