package locatorsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfCss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//1.tag and id ---->tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("pallavi");
		//2.tag and attribute --->tag[attribute name=value]
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("1234567890");
		//3.tag and class----> tag.class value
		//driver.findElement(By.cssSelector("button.selected ")).click();
		//4.tag ,class and attribute--->tag.class[attribute name=value]
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("chaudhari");

	}

}
