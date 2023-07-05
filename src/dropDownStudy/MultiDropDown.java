package dropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
		Select sc=new Select(cars);
		sc.selectByValue("audi");
		sc.selectByVisibleText("Volvo");
		sc.selectByIndex(1);
		sc.deselectAll();

	}

}
