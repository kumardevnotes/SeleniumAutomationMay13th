package com.io.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelDemo {

	public static void main(String[] args) throws IOException{

		String rootPath = System.getProperty("user.dir");

		// Reading from excel workbook
		FileInputStream fileInputStream = new FileInputStream(
				new File(rootPath + "//src//test//java//com//resources//MyTestData.xlsx"));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("AppData");
		
		int lastRowNum  = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		for(int row = 1; row <= lastRowNum ; row++ ) { // row = 1;  1 < 6
			System.out.println(sheet.getRow(row).getCell(0).toString()); // 
			}

		
		//Writing into excel workbook
		//System.out.println("Before writing/updating into excel sheet");
		System.out.println(sheet.getRow(2).getCell(1).toString()); // https://gmail.com
		
		//To write into Excel sheet
		FileOutputStream fileOutputStream = new 
				FileOutputStream(new File(rootPath + "//src//test//java//com//resources//MyTestData.xlsx"));
		
		//To update or write changes into excel sheet
		sheet.getRow(2).getCell(1).setCellValue("https://new.gmail.com");
		
		// save changes in excel sheet
		workbook.write(fileOutputStream);
		
		System.out.println("After writing/updating into excel sheet");
		System.out.println(sheet.getRow(2).getCell(1).toString());
		
		//To close excel sheet write operation
		fileOutputStream.close();
		
	}

}