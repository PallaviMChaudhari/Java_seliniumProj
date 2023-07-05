package miscellaniousTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.name("q")).sendKeys("harrier");
		
		List<WebElement> src = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		for(WebElement li:src){
			System.out.println(li.getText());
			
		}
		for(WebElement l:src) {
			String exp="harrier car";
			if(exp.equals(l.getText())) {
				l.click();
				break;
				
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.linkText("Images")).click();

	}

}
