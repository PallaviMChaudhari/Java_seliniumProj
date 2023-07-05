package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavichaudhari266@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("il0veM0kshu29");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(2000);
		WebElement myText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		String text = myText.getText();
		System.out.println("My text is :"+text);
		boolean isEnabled = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	    System.out.println("button is enabled or not? :"+isEnabled);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(10000);
	    
	    WebElement radioButton = driver.findElement(By.xpath("//input[@name='sex']"));
	    if(radioButton.isSelected()) {
	    	System.out.println("radio button is selected");
	    }
	    else {
	    	System.out.println("radio button is not selected");
	    }
	    
	    boolean display = radioButton.isDisplayed();
	    System.out.println("radio button is display or not ?"+display );
	    
	    //driver.close();

	}

}
