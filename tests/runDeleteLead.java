package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class runDeleteLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc002";
	}

	@Test(dataProvider = "testData")

	public void DeleteLead(String username, String password, String phoneNumber) throws InterruptedException {

		new LoginPage(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickFindLeads().clickPhone().enterPhoneNum(phoneNumber).clickFindLeadsButton()
				.getFirstLeadId().clickDeleteButton().clickFindLeads().enterLeadId().clickFindLeadsButton()
				.verifyDeletedLead();

	}

}
