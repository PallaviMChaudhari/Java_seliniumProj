package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonMeth {

	public static void implicitWaitMeth(WebDriver driver,long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void screenShotMeth(WebDriver driver,String fileName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String excelRead(int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\ExcelTest1.xlsx");
		String data = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	}


}
