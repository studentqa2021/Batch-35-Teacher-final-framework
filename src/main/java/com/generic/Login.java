package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.LoginPage;
import com.util.BaseConfig;

public class Login {
	//5 minutes
	public void getLogin() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();;
		driver.get(BaseConfig.getConfig("URL"));//good
		//sign in
		driver.findElement(LoginPage.signIn).click();
		//email
		driver.findElement(LoginPage.email).click();
		driver.findElement(LoginPage.email).sendKeys(BaseConfig.getConfig("email"));
	// password
		driver.findElement(LoginPage.password).click();
		driver.findElement(LoginPage.password).sendKeys(BaseConfig.getConfig("passWord"));
	//sign in
		driver.findElement(LoginPage.finalsignIn).click();
		//close browser
		driver.quit();
	}

}
