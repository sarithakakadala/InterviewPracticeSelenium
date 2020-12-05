package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.base;

public class AutomationpracticePage extends base{
	public AutomationpracticePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="radioButton")
	private List<WebElement> radiobuttonele;
	public List<WebElement> radiobutton()
	{
		return radiobuttonele;
	}
	
	@FindBy(css="#autocomplete")
	private  WebElement sugressiondropdownboxele;
	public  WebElement sugressiondropdown()
	{
		return sugressiondropdownboxele;
	}
	
	@FindBy(xpath="//*[@id=\"ui-id-1\"]/li")
	private List<WebElement> sugressiondropdownlistele;
	public List<WebElement> sugressiondropdownlist()
	{
		return sugressiondropdownlistele;
	}
	
	@FindBy(id="dropdown-class-example")
	private WebElement dropdownele;
	public WebElement dropdown()
	{
		return dropdownele;
	}
	
	
}
