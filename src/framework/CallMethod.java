package framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallMethod {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/?");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		PomStudy p=new PomStudy(driver);
		p.clickOnSignInButtonOnHomePage();
		Thread.sleep(5000);
		p.enterInMobileNumFeild(CommonMethod.excelRead(0, 0));
		Thread.sleep(5000);
		p.clickOnLoginWithPasswordField();
		Thread.sleep(5000);
		p.enterPasswordIntoPassField(CommonMethod.excelRead(0, 1));
		Thread.sleep(5000);
		p.clickOnSignInButton();
		Thread.sleep(5000);
		p.clickOnMyAccountButton();
		Thread.sleep(5000);
		p.clickOnMyProfileButton();
		Thread.sleep(5000);
		
		Set<String> allPageId = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(allPageId);
		
		driver.switchTo().window(al.get(1));
		
		CommonMethod.implicitWait(driver, 5000);
		
		ProfilePageOfPolicy p1=new ProfilePageOfPolicy(driver);
		
		p1.getProfiletext(CommonMethod.excelRead(0, 2));
	    
		
		
		
	}

}
