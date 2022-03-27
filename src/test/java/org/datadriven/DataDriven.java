package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven  {

	public static  String readFromExcel(int rowNo, int cellNo) throws IOException {
		File f=new File("D:\\Manual Me\\SqlReportOverAllTestData.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("report");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		if(c.getCellType()==1) {
			String data = c.getStringCellValue();
			return data;
		}
		else if(DateUtil.isCellDateFormatted(c)){
			Date da = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-mmm-yyyy");
			String data = sim.format(da);
			return data;
		}
		else {
			double d = c.getNumericCellValue();
			long lo=(long)d;
			String data = String.valueOf(lo);
			return data;
		}
		
	}
	
	public static void writeInExcel(int rowNo,int cellNo, String cellValue) throws IOException {
		File f=new File("D:\\Manual Me\\SqlReportOverAllTestData.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("report");
		Row r = sh.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(cellValue);
		FileOutputStream fo=new FileOutputStream(f);
		book.write(fo);
		
	}
	
	
}
