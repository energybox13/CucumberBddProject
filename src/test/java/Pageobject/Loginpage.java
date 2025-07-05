package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	

	public Loginpage(WebDriver rDriver) //Creating conntructor
	
	
	{
		
		this.ldriver= rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement e;
	
	
	@FindBy(xpath ="//input[@id='Password']" )
	WebElement pword;
		
	@FindBy(xpath ="//button[normalize-space()='Log in']")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	WebElement logoutlnk;
	
	public void enterEmail(String  emailAdd) //creating methods for each step 
	
	{
		e.clear();
		e.sendKeys(emailAdd); //email is find by email and emailAdd is passed by us
		
	}
	
	public void enterPassword(String pwd)
	{
		pword.clear();
		pword.sendKeys(pwd);
	}
	
	public void loginClick()
	{
		LoginBtn.click();
		
		
	}
	public void logout()
	{
		logoutlnk.click();
	}
	
}

