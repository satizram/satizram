package org.JavaMain;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;





public class Base  extends BaseClassh{
	static List<Object> user= new ArrayList<Object>();
	static List<Object> password= new ArrayList<Object>();
	
	
	
	@Test
	public static void Excel() throws IOException {
	
File fo= new File("C:\\Users\\satramam\\eclipse-workspace\\Data\\target\\Excel\\RFDS Tracker_12072021.xlsx");
FileInputStream fi= new FileInputStream(fo);
Workbook wo= new XSSFWorkbook(fi);
Sheet sh= wo.getSheet("Sheet1");
for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
	Row re = sh.getRow(i);
	for (int j = 0; j <re.getPhysicalNumberOfCells(); j++) {
		Cell ce = re.getCell(j);
		if (j%2==0) {
		String username = ce.getStringCellValue();
					}
		else {
			String password = ce.getStringCellValue();
		}
		}
		
		
		
		
		
	}
	System.out.println("\n\n");
}
	
}


