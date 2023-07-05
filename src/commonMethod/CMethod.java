package commonMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CMethod {
	public static void impliciteWait(WebDriver driver,long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
	}
	
	public static void screenshotCapture(WebDriver driver,File myFile) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot"+myFile+".png");
		FileHandler.copy(src, dest);
	}
	
	

}
