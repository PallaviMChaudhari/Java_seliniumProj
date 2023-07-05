package popUpStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewTab")).click();
		//we want to work on new/child window
		//we need to switch selenium focus from main page to Child browser
		//to switch to new window--> we should now windowID
		Set<String> AllWindowId = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(AllWindowId);
		String mainPageId = al.get(0);
		String childPageId = al.get(1);
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainPageId);
		String b = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		System.out.println("text on main page is :"+b);
		
	}

}
