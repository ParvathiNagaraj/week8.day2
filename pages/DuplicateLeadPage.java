package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{

	public DuplicateLeadPage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	
}
