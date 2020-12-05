package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.AutomationpracticePage;

public class AutomationPageTest extends base 
{
	public AutomationpracticePage ap;
	@Parameters({ "browser" })
	@BeforeMethod
	public void initialize(String browser) throws IOException
	{
	
		 driver =InitializeDriver(browser);
		 ap=new AutomationpracticePage(driver);

	}
	
	@Test
	public void verifyRadiobuttonfunctionality()
	{
		//System.out.println(driver.findElement(By.xpath("//input[@value='radio1']/parent ::label")).getText());
		String radiobtnname=prop.getProperty("radiobtnvalue");
		System.out.println(radiobtnname);
		List<WebElement> radiobnt=ap.radiobutton();
		for(int i=0;i<radiobnt.size();i++)
		{
			System.out.println(radiobnt.get(i).getAttribute("value"));
			if(radiobtnname.equals(radiobnt.get(i).getAttribute("value")))
			{
				
				radiobnt.get(i).click();
				if(radiobnt.get(i).isSelected())
				{
					System.out.println("Radio button selected");
					break;
					
				}
				else
				{
					System.out.println("Radio button not slected");
				}
			}
		}
	}
	
	@Test
	public void verifySugessiondropdwonfunctionality()
	{
		String sugressiontxt=prop.getProperty("sugessionboxtxt");
		ap.sugressiondropdown().sendKeys(sugressiontxt);
		List<WebElement> sugressionlistbox=ap.sugressiondropdownlist();
		//List<WebElement> sugressionlistbox=driver.findElements(by.)
		for(int i=0;i<sugressionlistbox.size();i++)
		{
			System.out.println(sugressionlistbox.get(i).getText());
			if(sugressiontxt.equals((sugressionlistbox.get(i).getText()).trim()))
			{
				sugressionlistbox.get(i).click();
			}
		}
	}
	
	@Test
	public void performallctionsfunctionality()
	{
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> i=win.iterator();
		while(i.hasNext())
		{
			String child=i.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println("child window: "+driver.getTitle());
				//driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("opentab")).click();
		Set<String> win1=driver.getWindowHandles();
		for(String j:win1)
		{
			driver.switchTo().window(j);
			System.out.println("child2 open tab: "+driver.getTitle());
			
		}
	}
	
	@Test
	public void geturlinnewtab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println("newTab opening: "+driver.getTitle());
	}
	
	@Test
	public void switchtoAlertfunctionality() throws InterruptedException
	{
		
		driver.findElement(By.id("alertbtn")).click();
		Alert a=driver.switchTo().alert();
		System.out.println("Alert text: "+a.getText());
		a.accept();
		driver.findElement(By.id("confirmbtn")).click();
		Alert a1=driver.switchTo().alert();
		System.out.println("Alert text: "+a.getText());
		a1.accept();
		WebElement element = driver.findElement(By.id("mousehover"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		Actions aactn=new Actions(driver);
		aactn.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		driver.findElement(By.xpath("//a[@href='#top']")).click();
		Thread.sleep(30000);
		//find the element in selenium webdriver
		WebElement userNameTxt = driver.findElement(By.id("autocomplete")); 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		// set the text
		jsExecutor.executeScript("arguments[0].value='testuser'", userNameTxt);  
		//get the text
		String text = (String) jsExecutor.executeScript("return arguments[0].value", userNameTxt);  
		System.out.println(text);
		
	}
	
	@AfterMethod
	public void closeDriver()
	{
		driver.quit();
	}
	
	
}
