package studyOfToolTip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://demo.guru99.com/test/social-icon.html");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   
	   String exp="Google+";
	   
	   WebElement actpath = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
	   String act = actpath.getAttribute("title");
	   System.out.println(actpath.getAttribute("title"));
	   
	   if(act.equals(exp)) {
		   System.out.println("tooltip is match with expected so test case is pass ");
		   
	   }
	   else {
		   System.out.println("tooltip isn'tmatch with expected so test case is fail ");
	   }
	   
	
	}    

}
