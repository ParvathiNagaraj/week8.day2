package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class EditLeadNew extends week8_day2_ProjectSpecificMethods{

	public EditLeadNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public EditLeadNew updateCompanyName(String companyName) {
		driver.findElement(By.id(property.getProperty("editLeadPage.updateCompanyName.id"))).sendKeys(companyName);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name(property.getProperty("editLeadPage.editLead.name"))).click();
		return new ViewLeadPage(driver);
	}
	
	
	
	}
