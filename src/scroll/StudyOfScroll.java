package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StudyOfScroll {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt); 
		driver.get("https://www.ajio.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(700,600)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-100,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,-300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-500,-600)");
		
	}

}
