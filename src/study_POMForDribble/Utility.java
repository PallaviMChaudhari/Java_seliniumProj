package study_POMForDribble;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	public static void threadTime(long time) throws InterruptedException {
		Reporter.log("wait for sometimes", true);

		Thread.sleep(time);
	}
	
	public static void impliciteWait(WebDriver driver,long time) {
		Reporter.log("Wait for sometimes", true);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
	}
	
	public static void takeScreenshot(WebDriver driver,String file) throws IOException {
		Reporter.log("Takeing Screenshot", true);

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot\\"+file+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		Reporter.log("read data from excel", true);

		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\drib.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
		}
	
	public static String readDataFromProperty(String key) throws IOException {
		Properties obj=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\Palya\\eclipse-workspace\\Java_seliniumProj\\PrDribFile.properties");
		obj.load(myFile);
		String value = obj.getProperty(key);
		Reporter.log("reading"+key+"from property File", true);
		return value;
	}
	

}
