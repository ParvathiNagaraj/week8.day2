package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class ViewLeadNew extends week8_day2_ProjectSpecificMethods{

	public ViewLeadNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}

	public ViewLeadNew verifyLeadId() {
		
		String LeadId = driver.findElement(By.id(property.getProperty("viewLeadPage.verifyLeadId.id"))).getText().replaceAll("[^0-9]", "");
		System.out.println("The LeadId is " + LeadId);
		return this;
	}
	
	public LeadsPage clickDeleteButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.deleteButton.linktext"))).click();
		return new LeadsPage(driver);
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.editButton.linktext"))).click();
		return new EditLeadPage(driver);
		
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.duplicateButton.linktext"))).click();
		return new DuplicateLeadPage(driver);
		
	}
}
