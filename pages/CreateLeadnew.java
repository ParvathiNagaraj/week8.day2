package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class CreateLeadnew extends week8_day2_ProjectSpecificMethods{

	public CreateLeadnew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}

	public CreateLeadnew enterCompanyName(String cName) {
		
		driver.findElement(By.id(property.getProperty("createLeadPage.companyName.id"))).sendKeys(cName);
		return this;
	}
	
	public CreateLeadnew enterFirstName(String fName) {
		
		driver.findElement(By.id(property.getProperty("createLeadPage.firstName.id"))).sendKeys(fName);
		return this;
	}
	
	public CreateLeadnew enterLastName(String lName) {
		
		driver.findElement(By.id(property.getProperty("createLeadPage.lastName.id"))).sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		
		driver.findElement(By.name(property.getProperty("createLeadPage.createLead.id"))).click();
		return new ViewLeadPage(driver);
	}
}
