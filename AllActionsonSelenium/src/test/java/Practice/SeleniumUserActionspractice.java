package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumUserActionspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saritha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.linkText("Practice Projects")).click();
		Thread.sleep(3000);
		/*List<WebElement> radioele=driver.findElements(By.className("radioButton"));
		
		for(int i=0;i<radioele.size();i++)
		{
			String txt=radioele.get(i).getAttribute("value");
			System.out.println(txt);
		}*/
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver1 = new FirefoxDriver(capabilities);

	}

}
