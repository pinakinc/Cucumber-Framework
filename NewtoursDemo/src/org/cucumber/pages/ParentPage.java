package org.cucumber.pages;

import org.openqa.selenium.WebDriver;

public class ParentPage {
	
	protected WebDriver driver;

	public ParentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage navigatetosite() {
		driver.get("http://www.newtours.demoaut.com");
		return new HomePage(driver);
	}
	
	public void CloseBrowser(){
		driver.quit();
	}
	
	

}
