package dataDrivenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1)Create a File("path") 
		File file=new File("./testDataFolder/excelTestData.xlsx");
		
		//2)Create a Object for FileInputStream
		FileInputStream fis=new FileInputStream(file);
		
		//3)Create a object of workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		double number = wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(number);

		boolean booleanVal = wb.getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(booleanVal);
		
		String name = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(name);
		
		LocalDateTime date = wb.getSheet("Sheet1").getRow(3).getCell(1).getLocalDateTimeCellValue();
		System.out.println(date);
	}
}
