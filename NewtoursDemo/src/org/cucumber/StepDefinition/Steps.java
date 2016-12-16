package org.cucumber.StepDefinition;

import org.cucumber.pages.HomePage;
import org.cucumber.pages.RegisterConf;
import org.cucumber.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

WebDriver driver;
HomePage hmpage;
RegisterPage regpage;
RegisterConf regconf;

@Given("^I am on newtours site$")
public void i_am_on_site() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Desktop\\Documents\\Selenium\\jars\\chromedriver.exe");
    driver = new ChromeDriver();
	hmpage = new HomePage(driver);
	hmpage.navigatetosite();
	
}

@When("^I click on \"([^\"]*)\"$")
public void i_click_on(String arg1) throws Throwable {
	regpage = hmpage.navigatetoregister();
}

@When("^I enter \"([^\"]*)\" into the FirstName field$")
public void i_enter_into_the_FirstName_field(String fname) throws Throwable {
	regpage.enterFirstName(fname);
}

@When("^I enter \"([^\"]*)\" into the LastName field$")
public void i_enter_into_the_LastName_field(String lname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterLastName(lname);
}

@When("^I enter \"([^\"]*)\" into the Phone field$")
public void i_enter_into_the_Phone_field(String phn) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterPhone(phn);
}


@When("^I enter \"([^\"]*)\" into the Email field$")
public void i_enter_into_the_Email_field(String eml) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enteremail(eml);
}

@When("^I enter \"([^\"]*)\" into the Addressone field$")
public void i_enter_into_the_Addressone_field(String add1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enteraddress1(add1);
}

@When("^I enter \"([^\"]*)\" into the Addresstwo field$")
public void i_enter_into_the_Addresstwo_field(String add2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enteraddress2(add2);
}

@When("^I enter \"([^\"]*)\" into the City field$")
public void i_enter_into_the_City_field(String city) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.entercity(city);
}

@When("^I enter \"([^\"]*)\" into the State field$")
public void i_enter_into_the_State_field(String st) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterstate(st);
}

@When("^I enter \"([^\"]*)\" into the PostalCode field$")
public void i_enter_into_the_PostalCode_field(String zip) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterzip(zip);
}

@When("^I select \"([^\"]*)\" from the Country field$")
public void i_select_from_the_Country_field(String cntry) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.entercountry(cntry);
}

@When("^I enter \"([^\"]*)\" into the UserName field$")
public void i_enter_into_the_UserName_field(String unm) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enteruserName(unm);
}

@When("^I enter \"([^\"]*)\" into the Password field$")
public void i_enter_into_the_Password_field(String pwd) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterpassword(pwd);
}

@When("^I enter \"([^\"]*)\" into the Confirm Password field$")
public void i_enter_into_the_Confirm_Password_field(String cpwd) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regpage.enterconfpassword(cpwd);
}

@When("^I click on the Submit button$")
public void i_click_on_the_Submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	regconf=regpage.clickregister();
}

@Then("^confirmation should contain \"([^\"]*)\"$")
public void confirmation_should_contain(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String text1 = regconf.RegisterConf();
	Assert.assertTrue(text1.contains("Thank you"));
}
}
