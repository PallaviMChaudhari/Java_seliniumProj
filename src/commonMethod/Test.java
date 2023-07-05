package commonMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		CommonMeth.implicitWaitMeth(driver, 5000);
		CommonMeth.screenShotMeth(driver, "Sc5");
		System.out.println(CommonMeth.excelRead(1, 0));
	}

}
