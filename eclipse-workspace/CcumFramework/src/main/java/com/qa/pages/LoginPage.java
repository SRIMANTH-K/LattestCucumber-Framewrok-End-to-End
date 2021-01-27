package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	private By singnin = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");

	public void clickonsignin() {

		driver.findElement(singnin).click();

	}

	public String gettitle() {

		return driver.getTitle();
	}

	public String getLoginpageTtile() {

		return driver.getTitle();

	}

	private By Login = By.xpath("//*[@id='email']");

	public void enterusername(String user) {

		driver.findElement(Login).clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Login).sendKeys(user);

	}

	private By Pass = By.xpath("//*[@id='passwd']");

	public void enterpass(String pass) {
		
		driver.findElement(Pass).clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Pass).sendKeys(pass);

	}

	private By submitt = By.xpath("//*[@id='SubmitLogin']");

	public void submittbutton() throws InterruptedException {
	
		Thread.sleep(5);
		driver.findElement(submitt).click();

	}

	public String getTitleofAccountpage() {
		
		return driver.getTitle();
		
		
	}
	
	public AccountPage combinelogin(String usern, String passW) {
		
		driver.findElement(Login).sendKeys(usern);
		
		driver.findElement(Pass).sendKeys(passW);
		driver.findElement(submitt).click();
		
		return new AccountPage(driver);
	}
	
	// 1.CONSTRUCTOR
	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}
}
