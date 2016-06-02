package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class assignmentexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create the web driver
				WebDriver d =new FirefoxDriver();
				
				// opne url		
				Thread.sleep(5000);		
				d.get("http://store.demoqa.com/");
				
				
				// select product category link			
				Thread.sleep(5000);		
				WebElement e=d.findElement(By.linkText("Product Category"));
							
				// e.click(); // direct
				
				// mouse actions
				Actions a=new Actions(d);		
				Thread.sleep(5000);		
				a.moveToElement(e).build().perform(); 
		// a.moveToElement(d.findElement(By.linkText("Product Category"))).build().perform();
				
				
				// click on ipad link text
				Thread.sleep(5000);		
				d.findElement(By.linkText("iPads")).click();
				

	}

}
