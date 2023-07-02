package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.OnlineBankingLoginPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stefdef {
	WebDriver driver;
	@Given("Go to application URL")
	public void go_to_application_url() throws Exception {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(BaseConfig.getConfig("URL"));
		driver.navigate().to(BaseConfig.getConfig("URL")); 
	}

	@When("put valid user name")
	public void put_valid_user_name() throws Exception {
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("USER"));
	
	}

	@When("put valid password")
	public void put_valid_password() throws Exception {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("PASSWORD"));
		
	}

	@When("click login")
	public void click_login() {
		driver.findElement(OnlineBankingLoginPage.getLogin()).click();
	}

	@Then("Logout button should visible for Successfull login")
	public void logout_button_should_visible_for_successfull_login() {
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogOutBtn()).isDisplayed());
		System.out.println("Hellow");
		
		sf.assertAll();
	}

	@When("put invalid user name")
	public void put_invalid_user_name() throws Exception {
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		System.out.println(BaseConfig.getConfig("INVALID_USER"));
		driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("INVALID_USER"));
	
	}

	@When("put invalid password")
	public void put_invalid_password() throws Exception {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		System.out.println(BaseConfig.getConfig("INVALID_PASSWORD"));
		driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("INVALID_PASSWORD"));
		
	}

	@Then("Logout button should not visible for Successfull login")
	public void logout_button_should_not_visible_for_successfull_login() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(!driver.findElement(OnlineBankingLoginPage.getLogOutBtn()).isDisplayed());

		
		sf.assertAll();
	}


}
