package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement logInButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		Actions act=new Actions(driver);
		//act.click(logInButton).perform();
		
		act.moveToElement(logInButton).click().build().perform();
	}

}
