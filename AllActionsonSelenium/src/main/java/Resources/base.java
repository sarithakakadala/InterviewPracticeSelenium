package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver InitializeDriver(String browser) throws IOException
	{
		prop = new Properties();
		//FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/Resources/config.properties");
		FileInputStream fs=new FileInputStream("F:\\Seleniumpractice\\AllActionsonSelenium\\src\\main\\java\\Resources\\config.properties");
		prop.load(fs);
		//String browsername=prop.getProperty("browser");
		//to getting the value from xml file
		String browsername=browser;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saritha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		return driver;
		
	}
}
