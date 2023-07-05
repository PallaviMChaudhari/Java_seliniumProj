package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class DropDownAndScreenshotAndExpliciteWait {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		Select s=new Select(year);
		s.selectByValue("1993");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String num = RandomString.make(2);
	
		File dest=new File("D:\\Selenium\\Screenshot\\Srcshot"+num+".png");
		FileHandler.copy(src, dest);
		
		
	}

}
