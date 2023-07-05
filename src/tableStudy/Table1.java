package tableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		for(int i=1;i<=50;i++) {
			for(int j=1;j<=5;j++) {
				WebElement tableElement = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]"));
				System.out.print(tableElement.getText()+" | ");
			}
			System.out.println();
		}

	}

}
