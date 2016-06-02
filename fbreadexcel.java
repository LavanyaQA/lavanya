package fbkeyframework;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class fbreadexcel {
	Workbook wb;
	Sheet sh;
	
	public void Opensheet(String filepath) throws BiffException, IOException
	{
		FileInputStream fs = new FileInputStream(filepath);
		wb = Workbook.getWorkbook(fs);
		sh = wb.getSheet(0);
	}
	
	public String GetValueFromCell(int r, int c)
	{
		String cdata = sh.getCell(c,r).getContents();
		return cdata;
	}
	public int Rowcount()
	{
		int r = sh.getRows();
		return r;
		
	}
	
	public int Columncount()
	{
		int c = sh.getColumns();
		return c;
	}

}
