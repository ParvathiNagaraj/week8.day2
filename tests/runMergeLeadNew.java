package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;
import com.leaftaps.ui.pages.Loginnew;

public class runMergeLeadNew extends week8_day2_ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc004";
	}

	@Test(dataProvider = "testData")

	public void MergeLead(String username, String password, String firstName1, String firstName2)
			throws InterruptedException {

		new Loginnew(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickMergeLead().clickFromLeadWidget().enterFromLeadFirstName(firstName1)
				.clickFromFindLeadButton().clickFirstFromLeadId().clickToLeadWidget().enterToLeadFirstName(firstName2)
				.clickToFindLeadButton().clickFirstToLeadId().clickMergeButton().acceptMergeAlert().clickFindLeads()
				.enterLeadId1().clickFindLeadsButton().verifyMergeLead();

	}

}
