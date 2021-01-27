package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	
	public WebDriver driver;
	
	
	
	private By contactlink = By.xpath("//*[@id='contact-link']");
	
	
	public void clickoncontactpage() {
		
	driver.findElement(contactlink).click();
		
		
	}
	
	public String getcontactpagetitle() {
		
		return driver.getTitle();
	}
	
	
	private By subject_Heading = By.xpath("//*[@id='id_contact']");
	
	public void getsubjectheading() {
		
		Select select = new Select(driver.findElement(subject_Heading));
		String text ="Customer service";
		select.selectByVisibleText(text);
		
	}
	

	
	
	private By entermailid= By.xpath("//*[@id='email']");
	
	public void entermailid(String email) {
		
		driver.findElement(entermailid).sendKeys(email);
		
	}
	
	private By orderref = By.xpath("//*[@id='id_order']");
	
	public void orderref(String ref) {
		
		driver.findElement(orderref).sendKeys(ref);
		
	}
	
	private By Entermessage = By.xpath("//*[@id='message']");
	
	public void enetermessage(String mesg) {
		
		
		driver.findElement(Entermessage).sendKeys(mesg);
	}
	
	private By sendbutton= By.xpath("//*[@id='submitMessage']");
	
	public void clickonsendbutton() {
		
		driver.findElement(sendbutton).click();
	}
	
	//1. CONSTRUCTOR
	public ContactUsPage (WebDriver driver) {
		
		
		this.driver=driver;
	}
	
}
