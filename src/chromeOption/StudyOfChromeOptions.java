package chromeOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StudyOfChromeOptions {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opt); 
		driver.get("https://www.google.com/");
		String gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		String imageLink = driver.findElement(By.xpath("//a[text()='Images']")).getText(); 
		System.out.println("text is :"+gmailLink);
		System.out.println("text is :"+imageLink);

	}

}
