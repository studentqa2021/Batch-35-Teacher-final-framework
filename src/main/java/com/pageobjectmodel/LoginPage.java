package com.pageobjectmodel;

import org.openqa.selenium.By;


public class LoginPage  {//Page object model
	
	public static By signIn =By.xpath("//*[@class='authorization-link']");
	public static By email =By.xpath("//*[@id='email']");
	public static By password =By.xpath("//*[@id='pass']");
	public static By finalsignIn =By.xpath("//*[@class='action login primary']");
}
