package tableStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		for(int i=1;1<=2;i++) {
			if(i==1) {
				List<WebElement> header = driver.findElements(By.xpath("//table[@class='tg']//tr["+i+"]//th"));
				Iterator<WebElement> th = header.iterator();
				while(th.hasNext()) {
					System.out.print(th.next().getText()+" | ");
				}
				System.out.println();
			}
			else {
				for(int j=1;j<=5;j++) {
					if( j<=2) {
						WebElement rowElement = driver.findElement(By.xpath("//table[@class='tg']//tr[2]//td["+j+"]"));
						System.out.print(rowElement.getText()+" | ");
					}
					else if(j>2&&j<=4) {
						WebElement rowElement = driver.findElement(By.xpath("//table[@class='tg']//tr[2]//td["+j+"]"));
						rowElement.click();
						System.out.println(rowElement.getText());
						
					}
					else {
						break;
					}
				}
				
			}
			
			
		}
	}

}
