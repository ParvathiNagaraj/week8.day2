package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class Loginnew extends week8_day2_ProjectSpecificMethods {

	public Loginnew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public Loginnew enterUserName(String username) {
		
		driver.findElement(By.id(property.getProperty("loginPage.username.id"))).sendKeys(username);
		return this;
	}
	
	public Loginnew enterPassword(String password) {
		
		driver.findElement(By.id(property.getProperty("loginPage.password.id"))).sendKeys(password);
		return this;
	}

	public WelcomePage clickLoginButton() {
		
		driver.findElement(By.className(property.getProperty("loginPage.Login.class"))).click();
		return new WelcomePage(driver);
	}
}
