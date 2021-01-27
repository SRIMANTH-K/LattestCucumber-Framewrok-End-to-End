package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	public WebDriver driver;

	public String getAcoountPageTitle() {

		return driver.getTitle();

	}

	private By Accountlsit = By.xpath("//*[@id='center_column']/div/div[1]/ul/li");

	public int getacountcount() {

		return driver.findElements(Accountlsit).size();

	}

	private By AccountlsitText = By.xpath("//*[@id='center_column']/div/div[1]/ul/li");

	public void sectiontext() {

		List<String> acountlsit = new ArrayList<>();

		List<WebElement> sectionlist = driver.findElements(AccountlsitText);

		for (WebElement e : sectionlist) {

			String text = e.getText();

			acountlsit.add(text);
			System.out.println("AcountSectionsText is:" + text);

		}
	}

	public AccountPage(WebDriver driver) {

		this.driver = driver;

	}
}
