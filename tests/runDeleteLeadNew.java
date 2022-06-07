package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;
import com.leaftaps.ui.pages.Loginnew;

public class runDeleteLeadNew extends week8_day2_ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc002";
	}

	@Test(dataProvider = "testData")

	public void DeleteLead(String username, String password, String phoneNumber) throws InterruptedException {

		new Loginnew(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickFindLeads().clickPhone().enterPhoneNum(phoneNumber).clickFindLeadsButton()
				.getFirstLeadId().clickDeleteButton().clickFindLeads().enterLeadId().clickFindLeadsButton()
				.verifyDeletedLead();

	}

}
