package setSize_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfSetPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("default position of window :"+driver.manage().window().getPosition());
		
		Point p=new Point(120, -120);
		
		driver.manage().window().setPosition(p);
	}

}
