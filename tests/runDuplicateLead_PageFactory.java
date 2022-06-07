package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;
import com.leaftaps.ui.pages.Login_PageFactory;

public class runDuplicateLead_PageFactory extends PageFactory_ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc005";
	}

	@Test(dataProvider = "testData")

	public void DuplicateLead(String username, String password, String phoneNumber) throws InterruptedException {

		new Login_PageFactory(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickFindLeads().clickPhone().enterPhoneNum(phoneNumber).clickFindLeadsButton().getFirstLeadId()
				.clickDuplicateButton().clickCreateLeadButton().verifyLeadId();

	}

}
