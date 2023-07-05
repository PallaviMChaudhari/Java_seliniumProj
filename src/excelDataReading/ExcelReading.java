package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\\\Selenium\\\\ExcelSheetReading\\\\ExcelTest2.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		int row = mySheet.getLastRowNum();
		short cellNum = mySheet.getRow(0).getLastCellNum();
		int cell=cellNum-1;
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=cell;j++) {
				Cell cellValue = mySheet.getRow(i).getCell(j);
				CellType type = cellValue.getCellType();
				if(type.equals(CellType.STRING)) {
					String value = cellValue.getStringCellValue();
					System.out.print(value);
					
				}
				else if(type.equals(CellType.NUMERIC)) {
					double value = cellValue.getNumericCellValue();
					System.out.print(value);
					
				}
				else if(type.equals(CellType.BLANK)) {
					System.out.print("||");
				}
				else if(type.equals(CellType.BOOLEAN)) {
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value);
				}
			}
			System.out.println();
		}
	}

	
}
