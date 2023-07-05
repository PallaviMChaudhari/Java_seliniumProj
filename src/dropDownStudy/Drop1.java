package dropDownStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop1 {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				Thread.sleep(5000);
				WebElement month = driver.findElement(By.name("birthday_month"));
				Select s=new Select(month);
				s.selectByVisibleText("Jun");

		

		

	}

}
