package dropDownStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class StudyOfDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(2);
		File dest= new File("D:\\Selenium\\Screenshot\\screenshot"+random+".png");
		FileHandler.copy(src, dest);
		driver.findElement(By.xpath(" //a[text()='Create new account']")).click();
		Thread.sleep(15000);
		driver.findElement(By.name("firstname")).sendKeys("pallavi");
		driver.findElement(By.name("lastname")).sendKeys("chaudhari");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9405888175");
		driver.findElement(By.id("password_step_input")).sendKeys("1234567891");
		//how to handle drop down
		//1.Identify list box to be handled and store it in reference variable
		WebElement date = driver.findElement(By.id("day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		
		Select sd=new Select(date);
		//3.By using one of the select class methods we can select values form list box like
		// 1. selectByVisibleText
		sd.selectByVisibleText("26");
		
		//2.select by index
		 WebElement month = driver.findElement(By.id("month"));
		 
		 Select sm=new Select(month);
		 sm.selectByIndex(5);
		 //3.select by value
		 WebElement year = driver.findElement(By.id("year"));
		 Select sy=new Select(year);
		 sy.selectByValue("1993");
		 
		 //select radio button
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String random1 = RandomString.make(2);
		 
		 File dest1=new File("D:\\Selenium\\Screenshot\\screenshot"+random1+".png");
		 FileHandler.copy(src1, dest1);
		 
		 driver.close();
		 
		 
		  
		
	}

}
