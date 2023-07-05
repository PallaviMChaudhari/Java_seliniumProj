package mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\Practice.xlsx");
		
		 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		 int rowNum = mySheet.getLastRowNum();
		 short cellCount = mySheet.getRow(0).getLastCellNum();
		 int cellNum=cellCount-1;
		
		
		for(int i=0;i<=rowNum;i++) {
			for(int j=0;j<=cellNum;j++) {
				Cell cellvalue = mySheet.getRow(i).getCell(j);
				CellType type = cellvalue.getCellType();
				if(type==CellType.STRING) {
					String value = cellvalue.getStringCellValue();
					System.out.print(value+" ");
					
				}
				else if(type==CellType.NUMERIC) {
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+" ");
					
				}
				else if(type==CellType.BLANK) {
					System.out.print("==");
		
				}
				else if(type==CellType.BOOLEAN) {
					boolean value = cellvalue.getBooleanCellValue();
					System.out.print(value+" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
