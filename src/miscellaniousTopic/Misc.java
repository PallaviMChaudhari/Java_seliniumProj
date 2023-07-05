package miscellaniousTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Misc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
		driver.findElement(By.name("q")).sendKeys("ku");
		
		Thread.sleep(5000);
		
	     List<WebElement> src = driver.findElements(By.xpath("//ul[contains(@class,'col-12-12')]//li"));
	     
	     for(WebElement l:src) {
	    	System.out.println(l.getText()); 
	     }
	     
	     for(WebElement l:src) {
	    	 String exp="kurta set";
	    	 if(exp.equals(l.getText())){
	    		 l.click();
	    		 break;
	    	 }
	    	 
	     }
		
		
	 
	}

}
