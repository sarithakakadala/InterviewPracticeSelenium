package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Snapdealsmartphonesearch {
	@Test
	public void Searchsmartphone()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saritha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
		//input[@name='fromVal']
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("20000");
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("60000");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Oppo')]")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//li[@data-index='2']  [@class='search-li'] ")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//section[1]/div[contains(@class,'col-xs-6  favDp product-tuple-listing js-tuple ')]"));
		for(int i=0;i<elements.size();i++)
		{
			
			
		}
		
			
	}
}
