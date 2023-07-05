package frameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		String s = driver.findElement(By.xpath("//b[contains(text(),'Topic')]")).getText();
		System.out.println(s);
		driver.switchTo().frame("frame3");
		driver.findElement(By.cssSelector("input#a")).click();
		driver.switchTo().parentFrame();
		String s1 = driver.findElement(By.xpath("//b[contains(text(),'Topic')]")).getText();
		System.out.println(s1);
	    driver.findElement(By.tagName("input")).sendKeys("Selenium");
        driver.switchTo().parentFrame();
		String s3 = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
		System.out.println(s3);
		driver.switchTo().frame("frame2");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select sc=new Select(animals);
		sc.selectByVisibleText("Big Baby Cat");
		driver.switchTo().parentFrame();
		String l = driver.findElement(By.xpath("//h1[contains(text(),'Selenium')]")).getText();
		System.out.println(l);
	}

}
