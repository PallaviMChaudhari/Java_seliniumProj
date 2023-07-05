package commonMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMUse {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		CommonMethod.screenshotCapture(driver,"Sc1");
		
		String value = CommonMethod.excelRead(0, 1);
		System.out.println(value);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		CommonMethod.methodForSscroll(driver,ele);

	}

}
