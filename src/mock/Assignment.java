package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		//insert url
		driver.manage().window().maximize();
		driver.get("https://tradepanel.neostox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//click on sign in button
		
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//insert mobile number and click on sign in button
		
		driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("9405888174");
		driver.findElement(By.id("lnk_signup1")).click();
		
		//insert password and click on submit
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.id("txt_accesspin")).sendKeys("3776");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		//handle 1st hidden division pop up
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		
		//handle 2nd pop up hidden division
		
		//driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		
		//refresh window
		driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		// driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		
		//get virtual money value
		
		WebElement virtualMoney = driver.findElement(By.xpath("(//span[contains(text(),'Virtual Money:')])[1]"));
		
		System.out.println("Virtual Money value :"+virtualMoney.getText());
		
		driver.findElement(By.id("txt_instruments1")).sendKeys("bajaj auto");
		driver.findElement(By.xpath("//a[text()='BAJAJ AUTO']")).click();
		driver.findElement(By.id("txt_instruments1")).sendKeys("ABB INDIA");
		driver.findElement(By.xpath("//a[text()='ABB INDIA']")).click();
		driver.findElement(By.xpath("(//span[text()='B'])[1]")).click();
		
		
		//find the overall list of ul 
		virtualMoney.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='drop-down dropdown-menu dropdown-menu-right righttopdropdownmenu show']//li"));
		
		for(WebElement li:elements) {
			System.out.println(li.getText());
		}
		for(WebElement li:elements) {
			System.out.println(li.getText());
			String a="Logout";
			if(a.equals(li.getText())) {
				li.click();
				break;
			}
			
			
		}
		
		
		

	}

}
