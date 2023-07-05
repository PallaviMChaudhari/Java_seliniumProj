package dropDownStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
		
		WebElement birthDay = driver.findElement(By.id("day"));
		Select s=new Select(birthDay);
		s.selectByVisibleText("26");
		
		WebElement monthName = driver.findElement(By.id("month"));
		Select s1=new Select(monthName);
		s1.selectByVisibleText("Jun");
		
		WebElement yearName = driver.findElement(By.id("year"));
		Select s2=new Select(yearName);
		s2.selectByVisibleText("1993");
		

	}

}
