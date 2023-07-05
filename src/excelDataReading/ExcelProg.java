package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelTest.xlsx");
		
		//String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		//System.out.println(value);
		
		//boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		//System.out.println(value);
		
		double value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value);
		
		
		
		
	}

}
