package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class HomeNew extends week8_day2_ProjectSpecificMethods {

	public HomeNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText(property.getProperty("homePage.leads.linktext"))).click();
		return new LeadsPage(driver);
	}

}
