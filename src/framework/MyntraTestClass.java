package framework;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?");
		
		Thread.sleep(5000);
		
		MyntraPage mp=new MyntraPage(driver);
		
		mp.clickOnWomenButton();
		Thread.sleep(5000);
		mp.enterValueIntoSearchbar();
		Thread.sleep(5000);
		mp.clickOnLiElement();
		Thread.sleep(5000);
		mp.clickOnDress();
		
		Set<String> allId = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allId);
		
		driver.switchTo().window(al.get(1));
		CommonMethod.implicitWait(driver, 5000);
		
		MyntraEthic me=new MyntraEthic(driver);
		me.clickOnDressSize();
		Thread.sleep(5000);
		me.clickOnAddToBagButton();
		Thread.sleep(5000);
		me.clickOnGoToBagButton();
		Thread.sleep(5000);
		me.clickOnPlaceOrder();
		

	}

}
