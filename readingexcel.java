package keywordframework;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readingexcel {
	Workbook wb;
	Sheet sh;
	public void OpenSheet(String filepath) throws BiffException, IOException
	{
		FileInputStream fs=new FileInputStream(filepath);		
		wb=Workbook.getWorkbook(fs);		
		sh=wb.getSheet(0);		
	}
	public String GetValueFromCell(int r,int c)
	{
		String cdata=sh.getCell(c, r).getContents();		
		return cdata;
	}
	public int Rowcount()
	{
		int r=sh.getRows();
		return r;
	}
	public int ColomnCount()
	{
		int c=sh.getColumns();
		return c;
	}
	

}
