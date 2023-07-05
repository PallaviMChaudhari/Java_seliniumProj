package studyOfWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitStd {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		WebDriverWait p=new WebDriverWait(driver, Duration.ofMillis(10000));
	    p.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()=' Home'])[1]")));
	    driver.findElement(By.xpath("(//a[text()=' Home'])[1]")).click(); 
		
		/*WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(10000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();*/

	}

}
