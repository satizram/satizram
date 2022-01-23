
package org.JavaMain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassh {
 public static WebDriver driver;
//browser launch
	public static void openBrowser() {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
	}
	//url passing
	public static void urlid(String url) {
driver.get(url);
	}
	//maximize
	public static void max() {
		driver.manage().window().maximize();
			}

	public static void sendkey(WebElement ele, String val) {
ele.sendKeys(val);
	}
	
	public static void cli(WebElement e) {
		e.click();
			}

public static void Sel(WebElement value,int index) {
Select se=new Select(value);
se.selectByIndex(index);
	}

public static void attri(WebElement val) {

System.out.println("Your order id is :\t"+val.getAttribute("value"));
}
 public static String excelRead(String path, String sheet, int row, int cell) throws IOException {
	 File f= new File(path);
	 FileInputStream fs=new FileInputStream(f);
	 Workbook book = new XSSFWorkbook(fs);
	 Sheet page = book.getSheet(sheet);
	 Row row2 = page.getRow(row);
	 Cell cell2 = row2.getCell(cell);
	String str = cell2.toString();
	return str;
	
}
public static void writeexcel(String input, int row, int cell, String cellinput) throws IOException {
File f= new File(input);
FileOutputStream out = new FileOutputStream(f);
Workbook book = new XSSFWorkbook();
Sheet s= book.createSheet("Satiz");
Row createRow = s.createRow(row);
Cell createCell = createRow.createCell(cell);
createCell.setCellValue(cellinput);
book.write(out);
}
public static void writeexcel2(String input, int row, int cell, String cellinput) throws IOException {
File f= new File(input);
FileInputStream fs=new FileInputStream(f);
Workbook book = new XSSFWorkbook(fs);
Sheet page = book.getSheet("satiz");
Row createRow = page.createRow(row);
Cell createCell = createRow.createCell(cell);
createCell.setCellValue(cellinput);
FileOutputStream out= new FileOutputStream(f);
book.write(out);
}

public static void implicit() {
driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
}
//username password read excel
private void userpass(String user) throws IOException {
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


 }	 
}
 
