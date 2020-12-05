package Snapdealproject;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdealinterviewquestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saritha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
		//input[@name='fromVal']
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("20000");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("60000");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Opp')]")).click();
		Thread.sleep(500);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Opp')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(500); 
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//li[@data-index='2']  [@class='search-li'] ")).click();
		List<WebElement> ele1=driver.findElements(By.xpath("//div/a[@data-key='Brand|Brand']"));
		for(int j=0;j<ele1.size();j++)
		{
			String brandname=ele1.get(j).getText();
			System.out.println(brandname);
		}
		
		List<WebElement> ele2=driver.findElements(By.xpath("//section[@data-dpwlbl='Product Grid'][1]/child::div"));
		int temp=0;
		int cnt=0;
		int [] intprice;
		int [] pricevalearr;
		for(int i=0;i<ele2.size();i++)
		{
			List<WebElement> price=driver.findElements(By.xpath("//span[contains(@id,'display-price')]"));
			String pricevalue=price.get(i).getAttribute("display-price");
			int intpriceval=Integer.parseInt(pricevalue);
			pricevalearr=new int[ele2.size()];
			
			pricevalearr[i]=intpriceval;
			if(pricevalearr[i]>pricevalearr[i+1])
			{
				System.out.println("decending order");
				break;
			}
		}
		driver.close();
	}

}
