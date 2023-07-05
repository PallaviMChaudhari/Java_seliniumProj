package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelTest.xlsx");
		
	    //String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
		//System.out.println(value);
		
		double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		  
		System.out.println(value1);
		
		
		
	}
}
