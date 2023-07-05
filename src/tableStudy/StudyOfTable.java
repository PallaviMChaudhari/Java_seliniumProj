package tableStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		//1.how find table header row
		
		for(int i=1;i<=5;i++) {
			WebElement header = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//th["+i+"]"));
			System.out.print(header.getText()+" | ");
			
		}
		System.out.println();
		
		System.out.println("==========================================");
		//2.how find table header row
		
		List<WebElement> header = driver.findElements(By.tagName("th"));
		
		Iterator<WebElement> th = header.iterator();
		while(th.hasNext()) {
			System.out.print(th.next().getText()+" | ");
		}
		
		System.out.println("=========================================");
		//how to find single element in row
		
		WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//td[2]"));
		System.out.println("element is :"+element.getText());
		
		//2nd way
		
		WebElement element2 = driver.findElement(By.xpath("(//td[text()='A'])[2]"));
		System.out.println(element2.getText());
		
		System.out.println("==========================================");
		
		//how to find single row of table
		
		for(int i=1;i<=5;i++) {
			WebElement row1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[5]//td["+i+"]"));
			System.out.print("row is :"+row1.getText()+" | ");
		}
		
		System.out.println("==========================================");
		
		//how to find all row in table
		
		for(int i=1;i<=26;i++) {
			
			for(int j=1;j<=5;j++) {
				WebElement rowElement = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["  +j+"]"));
				System.out.print(rowElement.getText()+" | ");
			}
			System.out.println();
			
		}
		

	}

}
