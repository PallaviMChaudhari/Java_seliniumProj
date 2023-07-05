package actionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPract {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Female']"));
		
		Actions act=new Actions(driver);
		act.sendKeys(firstName,"pallavi").perform();
		
		act.click(radioButton).perform();
	}

}
