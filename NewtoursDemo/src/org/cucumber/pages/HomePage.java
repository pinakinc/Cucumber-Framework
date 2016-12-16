package org.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {

	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public RegisterPage navigatetoregister()
	{
		driver.findElement(By.xpath("//a[contains(@href,'mercuryregister')][text()='REGISTER']")).click();
		return new RegisterPage(driver);
	}

}
