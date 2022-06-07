package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;



public class WelcomeNew extends week8_day2_ProjectSpecificMethods{

	public WelcomeNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public HomePage clickCRMSFALink() {
		driver.findElement(By.linkText(property.getProperty("welcomePage.crmsfa.linktext"))).click();
		return new HomePage(driver);
	}

}
