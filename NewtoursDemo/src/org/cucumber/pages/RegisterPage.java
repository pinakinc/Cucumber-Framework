package org.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends ParentPage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public RegisterPage enterFirstName(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		return this;
	}
	
	public RegisterPage enterLastName(String lname) {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		return this;
	}
	
	public RegisterPage enterPhone(String phone) {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
		return this;
	}
	 
	public RegisterPage enteruserName(String uname) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
		return this;
	}
	
	public RegisterPage enteraddress1(String add1) {
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(add1);
		return this;
	}
	
	public RegisterPage enteraddress2(String add2) {
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(add2);
		return this;
	}
	
	public RegisterPage entercity(String city) {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		return this;

	}
		
	public RegisterPage enterstate(String state) {
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		return this;
	}
	
	public RegisterPage enterzip(String zip) {
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(zip);
		return this;
	}

	public RegisterPage entercountry(String cntry) {
		new Select(driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText(cntry);
		return this;
	}

	public RegisterPage enteremail(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		return this;
	}

	public RegisterPage enterpassword(String passwd) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);
		return this;
	}

	public RegisterPage enterconfpassword(String confpwd) {
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confpwd);
		return this;

	}
	
	public RegisterConf clickregister() {
		driver.findElement(By.xpath("//input[@name='register']")).click();
		return new RegisterConf(driver);

	}


	}
	



