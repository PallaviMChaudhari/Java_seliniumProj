package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedUrl="https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Expeected Url is :"+expectedUrl);
		System.out.println("Actual Url is :"+actualUrl);
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("matching found.... ");
			
		}
		else {
			System.out.println("matching not found....");
		}
		
		driver.close();

	}

}
