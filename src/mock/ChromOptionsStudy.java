package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromOptionsStudy {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headLess");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com/login/");
		String text = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
		System.out.println("FaceBook Text :"+text);
	}

}
