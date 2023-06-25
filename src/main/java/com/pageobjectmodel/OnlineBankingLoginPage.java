package com.pageobjectmodel;

import org.openqa.selenium.By;

public class OnlineBankingLoginPage {
	
	
private	static By user = By.xpath("//*[@id='username']");
private static	By password = By.xpath("//*[@id='password']");
private static	By login = By.xpath("//*[@type='submit']");
private static	By logOutBtn = By.xpath("//*[@id='logoutButton']");

public static By getUser() {
	return user;
}
public static By getPassword() {
	return password;
}
public static By getLogin() {
	return login;
}
public static By getLogOutBtn() {
	return logOutBtn;
}




}
