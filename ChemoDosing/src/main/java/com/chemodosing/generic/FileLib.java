package com.chemodosing.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
public String readDataFromProperty(String key) throws IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resources/data/commondata.properties");
	Properties p = new Properties();
	p.load(fis);
	return p.getProperty(key);

}

/**
 * 
 * @param sheetName
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1 = new FileInputStream("./src/test/resources/data/testscript1.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}

/**
 * 
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public void writeDataIntoExcel(String sheetName, int row,int cell, String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis1 = new FileInputStream("./src/test/resources/data/testscript1.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos = new FileOutputStream(".test/resources/data/testscript1.xlsx");
	wb.write(fos);
	wb.close();
}

}

