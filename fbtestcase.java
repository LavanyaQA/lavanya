package fbkeyframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbtestcase {
	WebDriver d;
	
	public void Open_Browser(String tdata)
	{
		d = new FirefoxDriver();
		
	}
	public void Enter_url(String tdata)
	{
		d.get(tdata);
	}
	public void Enter_text(String ptype, String pvalue, String tdata)
	{
		By e;
		e = weblocators(ptype, pvalue);
		d.findElement(e).sendKeys(tdata);		
	}
	
	public void Click_On_Button(String pvalue, String ptype)
	{
		By e;
		e = weblocators(ptype, pvalue);
		d.findElement(e).click();
	}
	
	public By weblocators(String ptype, String pvalue)
	{
		By b;
		switch(ptype)
		{
		case "id":
			b=By.id(pvalue);
			break;
		case "name":
			b=By.name(pvalue);
			break;
		case "xpath":
			b=By.xpath(pvalue);
			break;
		case "linktext":
			b=By.linkText(pvalue);
			break;
		case "css":
			b=By.cssSelector(pvalue);
			break;
		default:
			b=null;
			break;
		}
		
		return b;
		
	}

}
