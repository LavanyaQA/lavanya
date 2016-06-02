package fbTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fbsampleTestng {

	@Test(priority=1)
	public void Fblogin() throws InterruptedException
	{
		//Firefox Driver
		Thread.sleep(500);
		WebDriver d = new FirefoxDriver();
		
		// Open Url
		Thread.sleep(500);
		d.get("https://www.facebook.com/");
		
		//Click on Emailid Button
		Thread.sleep(500);
		d.findElement(By.id("email")).clear();
		d.findElement(By.id("email")).sendKeys("aieseclavanya@gmail.com");
		
		//Click on Password Button
		Thread.sleep(500);
		d.findElement(By.id("pass")).sendKeys("Lavanyakelam");
		
		//Click on Login Button
		Thread.sleep(500);
		d.findElement(By.id("u_0_o")).click();
		
		//Click on navigation dropdown button
		Thread.sleep(500);
		WebElement e= d.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
		
			// mouse actions
			Actions a=new Actions(d);		
			Thread.sleep(400);		
			a.moveToElement(e).build().perform();
		
			//Click on log out
		
			d.findElement(By.id("u_4_3")).click();
		
	}

       }