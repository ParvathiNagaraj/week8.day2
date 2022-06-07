package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{

	public WelcomePage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public HomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}

}
