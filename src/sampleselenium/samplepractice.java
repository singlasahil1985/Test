package sampleselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.*;

import org.openqa.selenium.ie.*;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;





public class samplepractice



{
//	static
//	
//	{
//		System.out.println("child constructorhhj");
//		
//	}
	
//	public samplepractice()
//	{
//		
//		System.out.println("child custom constructor");
//	}
	
	
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
FileInputStream fs=new FileInputStream("E://Users//Sahil//workspace//sampleselenium//te.xlsx");
		
//FileOutputStream fsout=new FileOutputStream("E://Users//Sahil//workspace//sampleselenium//temp.xlsx");


		XSSFWorkbook wrkbook=new XSSFWorkbook(fs);	
		
		
		XSSFSheet wrksheet=wrkbook.getSheetAt(0);		
		
		for(int i=0;i<=wrksheet.getLastRowNum();i++)
			
		{
		
		XSSFRow row1=wrksheet.getRow(i);
		
		
		for(int j=0;j<row1.getLastCellNum();j++)
			
		{
			
			
			
			String cellval=row1.getCell(j).getStringCellValue();
			System.out.println(cellval);
			
		String val=	row1.getCell(j).getStringCellValue();

		
			row1.createCell(1).setCellValue(String.valueOf(Integer.parseInt(val)*2));
			
			
		}
		
		
		}	
		
	
	
		
		fs.close();
		
		FileOutputStream fsout=new FileOutputStream("E://Users//Sahil//workspace//sampleselenium//te.xlsx");
		
		
		
		

		
		wrkbook.write(fsout);
		

			fsout.flush();
			fsout.close();
			
			
		
		
		
		}

}
