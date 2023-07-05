package webDriverMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfWebMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is :"+currentUrl);
		//String a = driver.getPageSource();
		//System.out.println("Source code is :"+a);
		driver.get("https://vctcpune.com/contact-us");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("9405888174");
	    driver.getTitle();
		driver.close();
		
		
		

	}

}
