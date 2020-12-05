package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import pageObjects.AutomationpracticePage;
import pageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Resources.base;

public class HomepageTest extends base{
	public HomePage hp;
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void initialize(String browser) throws IOException
	{
	
		 driver =InitializeDriver(browser);
		 hp=new HomePage(driver);

	}
	@Test
	public void verifyHomepage()
	{
		
		hp.practicelink().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current URl : " +driver.getCurrentUrl());
		System.out.println("Titel : "+driver.getTitle());
		String title=driver.getTitle();
		Assert.assertEquals(title, "Rahul Shetty Academy","Home page title not matched");
		hp.nameinpttxt().sendKeys("saritha");
		hp.emailinputtxt().sendKeys("sarithakakadala@gmail.com");
		hp.agreementchkbox().click();
		hp.submitbtn().click();
		hp.Automationpracticelink().click();
		
	}

	@AfterTest
	public void closeDriver()
	{
		driver.quit();
	}
}
