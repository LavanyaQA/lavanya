package keywordframework;

import java.io.IOException;

import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class execution {
	@Test(priority=1)
	public void FinalProcess() throws BiffException, IOException, InterruptedException
	{
		
		// OpenExcel Sheet
		readingexcel mysheet=new readingexcel();
		String path="D:/GmailKeywordTestCases3.xls";
		mysheet.OpenSheet(path);
		
		int rcount=mysheet.Rowcount();
		int ccount=mysheet.ColomnCount();
		
		System.out.println("Row Count : "+rcount);
		System.out.println("Column count : "+ccount);
		
		String tname="";
		String ptype="";
		String pvalue="";
		String tdata="";
		
		// create the test case function object
		testcaseprocess tobj=new testcaseprocess();
		
		//Excel Sheet Loop
		for(int r=1;r<rcount;r++)
		{
			// Get TestCaseName
			tname=mysheet.GetValueFromCell(r, 0);
			
			
			for(int c=1;c<ccount;c++)
			{
				if(c==1)
				{
					ptype=mysheet.GetValueFromCell(r, c);
				}
				else if(c==2)
				{
					pvalue=mysheet.GetValueFromCell(r, c);
				}
				else if(c==3)
				{
					tdata=mysheet.GetValueFromCell(r, c);
				}
			}
			
			System.out.println(tname + " "+ptype+""+pvalue+""+tdata);
			Thread.sleep(7000);
			switch(tname)
			{
			case "Open_Browser":
				tobj.Open_Browser(tdata);
				break;
			case "Enter_url" :
				tobj.Enter_url(tdata);
				break;
			case "Click_On_Link":
				tobj.Click_On_Link(ptype, pvalue);
				break;
			case "Enter_text":
				tobj.Enter_text(ptype, pvalue, tdata);
				break;
			case "Click_On_Button":
				tobj.Click_On_Button(ptype, pvalue);
				break;
			default:
				System.out.println("No TestCase");
				break;
			}
			
		}
		
		
	}

}
