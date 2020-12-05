package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.base;
public class HomePage extends base {
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Practice Projects")
	private  WebElement practicetlinkele; 
	public  WebElement practicelink() {
		
		return practicetlinkele;
	}
	@FindBy(css="#name")
	private  WebElement nameele; 
	public  WebElement nameinpttxt() {
		
		return nameele;
	}
	@FindBy(css="#email")
	private  WebElement emailele; 
	public  WebElement emailinputtxt() {
		
		return emailele;
	}
	
	@FindBy(css="#form-submit")
	private  WebElement submitbtnele; 
	public  WebElement submitbtn() {
		
		return submitbtnele;
	}
	
	@FindBy(css="#agreeTerms")
	private WebElement agrementele;
	public WebElement agreementchkbox()
	{
		return agrementele;
	}
	@FindBy(linkText="Automation Practise - 2")
	private  WebElement Automationpracticelinkele; 
	public  WebElement Automationpracticelink() {
		
		return Automationpracticelinkele;
	}
	
}
