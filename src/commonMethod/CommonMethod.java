package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethod {
	public static void implicitWait(WebDriver driver,long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void screenshotCapture(WebDriver driver,String myFile) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot\\"+myFile+".png");
		FileHandler.copy(src, dest);
		
	}
	public static void methodForSscroll(WebDriver driver, WebElement element) {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static String excelRead(int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\ExcelTest1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		
	}

}