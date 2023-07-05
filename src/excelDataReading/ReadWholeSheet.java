package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\ExcelTest1.xlsx");
		
		Workbook myWork = WorkbookFactory.create(myFile);
		Sheet mySheet = myWork.getSheet("Sheet1");
		
		//we use nested for loop for both row n column
		
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
