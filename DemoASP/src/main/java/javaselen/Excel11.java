package javaselen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel11 {
	static FileInputStream f; //to open file
	static XSSFWorkbook w; // to open workbook
	static XSSFSheet sh;// to open sheet
	
	public static String getStringData(int a, int b) throws IOException //Because there is string values inthe data sheet
	{
		f=new FileInputStream("C:\\Users\\Zartech\\git\\Software\\Software\\DemoASP\\src\\main\\resources\\Bookhai.xlsx");
	    w=new XSSFWorkbook(f);
		
	    sh=w.getSheet("Sheet1");
	    Row r=sh.getRow(a);
	    Cell c=r.getCell(b);
	    
	    return c.getStringCellValue();
	    
	}
	
	public static String getIntData(int a, int b) throws IOException //both string values and integer values 
	{
		f=new FileInputStream("C:\\Users\\Zartech\\git\\Software\\Software\\DemoASP\\src\\main\\resources\\Bookhai.xlsx");
	    w=new XSSFWorkbook(f);
		
	    sh=w.getSheet("Sheet1");
	    Row r=sh.getRow(a);
	    Cell c=r.getCell(b);
	    int x=(int) c.getNumericCellValue();
	    return String.valueOf(x); //both string values and integer values so typecasting is done here
	}

}
