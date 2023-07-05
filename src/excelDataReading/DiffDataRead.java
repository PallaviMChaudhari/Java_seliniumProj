package excelDataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DiffDataRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\ExcelTest2.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		int rowNum = mySheet.getLastRowNum();
		int rowCount=rowNum;
		short cellNum = mySheet.getRow(0).getLastCellNum();
		int cellCount=cellNum-1;
		
		
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<=cellCount;j++) {
			   
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType type = myCell.getCellType();
				
				if(type==CellType.STRING) {
					String value = myCell.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(type==CellType.NUMERIC){
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
					
				}
				else if(type==CellType.BLANK) {
					
					System.out.print("=== ");
				}
				else if(type ==CellType.BOOLEAN) {
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
