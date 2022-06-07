package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public LoginPage enterUserName(String username) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public WelcomePage clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
