package selenium;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelSheet 
{
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
public  void excel(String Excellocation,String ExcelsheetName,int row,int cell)
 {
	 try {
		 fis=new FileInputStream(new File("Excellocation"));
		 workbook=new XSSFWorkbook(fis);
		 sheet = workbook.getSheet(ExcelsheetName);
		int totalRow = sheet.getLastRowNum();
		for(int i=0;i<totalRow;i++)
		{
			XSSFRow r= sheet.getRow(row);
			String celll = r.getCell(cell).getStringCellValue()+1;
		}	
	} 
	 catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
 }
}
