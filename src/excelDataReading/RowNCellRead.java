package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowNCellRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\Excel1.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		int RowNum = mySheet.getLastRowNum();
		System.out.println(RowNum);
		int rowCount=RowNum;
		
		short CellNum = mySheet.getRow(0).getLastCellNum();
		System.out.println(CellNum);
		int cellCount=CellNum-1;
		
		//print row
		for(int i=0;i<=cellCount;i++) {
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
		
		//to print 1st cell
		
		for(int i=0;i<=rowCount;i++) {
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		
		
		

	}

}
