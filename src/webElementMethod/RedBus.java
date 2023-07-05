package webElementMethod;
import java.time.Duration;
import java.util.List;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		List<WebElement> src1 = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
		for(WebElement l:src1) {
			System.out.println(l.getText()); 
		}
		for(WebElement l1:src1) {
			String exp1="Hadapsar, Pune";
			if(exp1.equals(l1.getText()));
			{
				l1.click();
			    break;
			}
		}
		
		/*driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("ahemdabad");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		WebElement destMonth = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		
		
	    for(int i=1;i<=12;i++) {
		   String monthName = destMonth.getText();
		   System.out.println(monthName);
		   
			
			if(monthName.equals("Sept 2023")) {
				driver.findElement(By.xpath("//td[text()='26']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
				
			}
		
		}*/
		//Thread.sleep(10000);
      // driver.close();
	}

}
