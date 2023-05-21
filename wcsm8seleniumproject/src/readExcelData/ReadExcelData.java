package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	//Read data from IPL Excel Sheet..

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data/Test data.xlsx");//provide the path of Excel Sheet
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into sheet
		Row row = sheet.getRow(3);//get into desired row
		Cell cell = row.getCell(1);//get into desired cell
		String data = cell.getStringCellValue();//get the value from cell
		System.out.println(data);
		
		
           
	}

}
