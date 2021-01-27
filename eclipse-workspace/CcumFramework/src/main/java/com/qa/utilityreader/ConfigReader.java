package com.qa.utilityreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader {

	public WebDriver driver;
	
	private Properties prop;
	
	public Properties initializeprop() throws IOException {
		
		
		prop = new Properties();
		
		String config  = System.getProperty("user.dir") + "\\src\\main\\java"
				+ "\\resources\\config\\Data.properties";
		try {
			
			FileInputStream fis = new FileInputStream(config);
			
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
		
		
	}
	
	
	}
	
