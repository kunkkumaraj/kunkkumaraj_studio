package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pojoclass extends BaseClass{
	
	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='internal slackcart Associate']")
	public WebElement login;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	public WebElement loginclick;
	
	@FindBy(xpath = "//span[text()='Studio']")
	public WebElement studio;
	

}
