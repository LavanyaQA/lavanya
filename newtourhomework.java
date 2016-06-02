package newtourhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class newtourhomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver d=new FirefoxDriver();
		
		// Open Url
		d.get("http://www.newtours.demoaut.com/");
		
		// handling username textbox
		Thread.sleep(5000);
		d.findElement(By.name("userName")).sendKeys("mahesh");
		
		
		// handling password textbox
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("mahesh");
		
		// click on sign in image button
		Thread.sleep(5000);
		d.findElement(By.name("login")).click();
		
		//click on number of passengers
		Thread.sleep(5000);
		Select drp=new Select(d.findElement(By.name("passCount")));
		
		Thread.sleep(5000);
		drp.selectByValue("3");
		
		//Selecting drop down list arrving in
		Thread.sleep(5000);
		Select prt = new Select(d.findElement(By.name("toPort")));
		
		Thread.sleep(5000);
		prt.selectByValue("Frankfurt");
		
		//Selecting Month 
		
		Thread.sleep(5000);
		Select mte = new Select(d.findElement(By.name("toMonth")));
		
		Thread.sleep(5000);
		mte.selectByIndex(3);
	
		//Selecting Date
		Thread.sleep(5000);
		Select dte = new Select(d.findElement(By.name("toDay")));
		
		Thread.sleep(5000);
		dte.selectByIndex(9);
		
		//Selecting preferences
		Thread.sleep(5000);
		Select cls = new Select(d.findElement(By.name("servClass")));
		
		Thread.sleep(5000);
		cls.selectByValue("Business");
		
		// Selecting Airline
		Thread.sleep(5000);
        Select arl = new Select(d.findElement(By.name("airline")));
		
		Thread.sleep(5000);
		arl.selectByIndex(2);
		
		//Click on continue
		
		Thread.sleep(5000);
		d.findElement(By.name("findFlights")).click();
		
		
	}
	

}
