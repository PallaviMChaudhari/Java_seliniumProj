package pratikProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
     @FindBy(xpath = "//div[contains(@class,'textCapitalize sc-ckVGcZ kWpXlQ')]")private WebElement Mynameverification;
     
     public POM2(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void verifymyname()
     {
    	 System.out.println(Mynameverification.getText());
     }
     public void validateusername()
     {
    	 String ActualUN=Mynameverification.getText();
    	 String ExpUN="Prateek Ganorkar";
    	 if(ExpUN.equals(ActualUN))
    	 {
    		 System.out.println("Test Case has been passed ");
    	 }
    	 else
    	 {
    		 System.out.println("Test case has been failed");
    	 }
     }
     
     
}
