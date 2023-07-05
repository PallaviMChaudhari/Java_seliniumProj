package tableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		for(int r=1;r<=7;r++) {
			if(r==1) {
		     for(int i=1;i<=3;i++) {
		    	 WebElement header = driver.findElement(By.xpath("//table[@id='customers']//tr[1]//th["+i+"]"));
		    	 System.out.print(header.getText()+" | ");
			
		     }
		     System.out.println();
			}
			else {
				for(int i=1;i<=3;i++) {
					WebElement row = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+i+"]"));
					System.out.print(row.getText()+" | ");
				}
				System.out.println();
			}
		
		}
	}

}
