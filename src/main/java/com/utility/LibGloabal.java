package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGloabal  {

	boolean contains;
	public static WebDriver driver;

	public static void getDriver() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();	
//		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver-win64\\chromedriver.exe");
	  
	      driver=new ChromeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	
	
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("fb");	
		Assert.assertTrue("current URL not matched", contains);
	}


	public static String getData(int row,int cell) throws IOException {

		File loc=new File("C:\\Users\\Aysegul Akdeniz\\eclipse-workspace\\Susi_maven\\input\\STudents and COurses.xlsx");

		FileInputStream fi=new FileInputStream(loc);


		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		System.out.println("cellType is " + cellType);

		String value=null;

		if(cellType==1) {
			value = c.getStringCellValue();
			System.out.println(value);
		}


		else if(cellType==0)
		{
			if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();	
				System.out.println(dateCellValue);

				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-YYYY");

				value = sim.format(dateCellValue);//change
				System.out.println(value);
			}


			else {
				double numericCellValue = c.getNumericCellValue();	
				System.out.println(numericCellValue);

				long l=(long) numericCellValue;

				value = String.valueOf(numericCellValue);
				System.out.println(value);	
			}
		}
		return value;
	}

		public static void sendUserName(WebElement ele, String userName ) {
			ele.sendKeys(userName);	
		}
		
		public static void insertPwd(String pwd) {
			driver.findElement(By.id("pass")).sendKeys(pwd);		
		}

	public static void logButton() {
		driver.findElement(By.name("login")).click();
		
		
		
	}

	public static void closedBrowser() {
		driver.close();
	}
}



