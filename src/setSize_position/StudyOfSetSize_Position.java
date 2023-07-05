package setSize_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfSetSize_Position {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("default Size of window :"+driver.manage().window().getSize());
		
		Dimension d=new Dimension(400, 100);
		
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		Point p=new Point(150, 130);
		
		driver.manage().window().setPosition(p);
		

	}

}
