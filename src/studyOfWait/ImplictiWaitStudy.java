package studyOfWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictiWaitStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();*/
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement buyPlanButton = driver.findElement(By.xpath("(//h6[text()='Buy Plan'])[2]"));        buyPlanButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
	}

}
