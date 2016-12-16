package org.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterConf extends ParentPage {

	public RegisterConf(WebDriver driver) {
		super(driver);
	}
	
	public String RegisterConf(){
		String bdytext = driver.findElement(By.tagName("body")).getText();
		return bdytext;
	}

}
