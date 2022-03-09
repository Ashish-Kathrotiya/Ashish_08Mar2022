package com.Ashish_09Mar2022.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtils extends CommonDriverUtils{
	
	static String filepath = "src/test/resources/excel/testdata.xlsx";
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet testDataSheet;
	
	public static String readData(int rowNo){
		
			try {
				fis = new FileInputStream(filepath);
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			testDataSheet = wb.getSheetAt(0);
			
		
		return testDataSheet.getRow(1).getCell(rowNo).getStringCellValue();
	}
	

}
