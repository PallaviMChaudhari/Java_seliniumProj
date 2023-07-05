package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\ExcelTest1.xlsx");
		
		Workbook MyWork = WorkbookFactory.create(myFile);
		Sheet mySheet = MyWork.getSheet("Sheet1");
		
		int rowNum = mySheet.getLastRowNum();
		
		int rowCount=rowNum;
		short cellNum = mySheet.getRow(0).getLastCellNum();
		
		int cellCount=cellNum-1;
		
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<=cellCount;j++) {
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
			}
			
			System.out.println();
		}
		
		

	}

}
