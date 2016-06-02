package fbTestNg;

  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.File;

public class gmailtestng {

	@Test(dataProvider="GmailData")
	public void GLogin(String uname,String password) throws InterruptedException
	{
		// Fire fox driver
		Thread.sleep(7000);
		WebDriver d=new FirefoxDriver();
		
		// Open Url
		Thread.sleep(7000);
		d.get("https://www.google.co.in/#gws_rd=ssl");
		
		// Click on sign in button
		Thread.sleep(7000);
		d.findElement(By.id("gb_70")).click();
		
		// send the email id to textbox
		Thread.sleep(7000);
		d.findElement(By.id("Email")).clear();
		d.findElement(By.id("Email")).sendKeys(uname);
		
		// click on next button
		Thread.sleep(7000);
		d.findElement(By.id("next")).click();
		
		// send the password to textbox
		Thread.sleep(7000);
		d.findElement(By.id("Passwd")).clear();
		d.findElement(By.id("Passwd")).sendKeys(password);
		
		// click on sign in button
		Thread.sleep(7000);
		d.findElement(By.id("signIn")).click();
		
		// click on gmail link
		Thread.sleep(7000);
		d.findElement(By.linkText("Gmail")).click();
		
		
		// click on account picture box
		Thread.sleep(10000);
		d.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		// click on signout link
		Thread.sleep(7000);
		d.findElement(By.id("gb_71")).click();
		
		// close browser
		Thread.sleep(7000);
		d.close();
	}

	@DataProvider(name="GmailData")
	public Object[][] TestData() throws BiffException
	{
		// Take the excel sheet file
		File f=new File("D:/gmaillogin.xlsx");
		
		//Get the workbook
		Workbook wb=Workbook.getWorkbook(f);
		
		// Get the sheet
		Sheet s=wb.getSheet(0);
		// Sheet s=wb.getSheet("Sheet1")
		
		// get row count and column count 
		int r=s.getRows();
		int c=s.getColumns();
		
		System.out.println("Row Count : "+r);
		System.out.println("column Count : "+c);
		
		
		// Get Data From sheet
		String SData[][] =new String[r][c]; // String double dimensional array 
		
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				// get the value from sheet cells
				Cell v=s.getCell(j, i); // cell number and row number				
				SData[i][j]=v.getContents();
				
			}
		}
		
		
		// display the values
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(SData[i][j]+" ");
			}
			
			System.out.println("");
		}
		
		
		return SData;
}
}