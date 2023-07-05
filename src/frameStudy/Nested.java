package frameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nested {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		String s = driver.findElement(By.xpath("//b[contains(text(),'Topic')]")).getText();
		System.out.println(s);
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		driver.switchTo().frame("frame3");
		driver.findElement(By.cssSelector("input#a")).click();
		driver.switchTo().defaultContent();
    	String s2 = driver.findElement(By.xpath("//h1[contains(text(),'Frames')]")).getText();
		System.out.println(s2);
    	Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		WebElement drop = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1=new Select(drop);
		s1.selectByVisibleText("Baby Cat");
		
		

	}

}
