package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class DuplicateLeadNew extends week8_day2_ProjectSpecificMethods{

	public DuplicateLeadNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name(property.getProperty("duplicateLeadPage.duplicatelead.name"))).click();
		return new ViewLeadPage(driver);
	}
	
	
}
