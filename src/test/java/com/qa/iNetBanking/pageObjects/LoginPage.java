package com.qa.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	//xpath of username //input[@name='uid']
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	//xpath of password //input[@name='password']
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginButton;
	
	//xpath of loginbutton //input[@name="btnLogin"]
	
	@FindBy(xpath="//a[contains(text(), 'Log out')]")
	WebElement logoutButton;
	
	public void setUserName(String Uname)
	{
		txtUserName.sendKeys(Uname);
	}
	
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	public void clickLoginBtn()
	{
		loginButton.click();
	}
	
	public void clickLogoutBtn()
	{
		logoutButton.click();
	}
	
	

}
