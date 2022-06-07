package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;
import com.leaftaps.ui.pages.CreateLeadPage;
import com.leaftaps.ui.pages.HomePage;
import com.leaftaps.ui.pages.LeadsPage;
import com.leaftaps.ui.pages.Login_PageFactory;
import com.leaftaps.ui.pages.ViewLeadPage;
import com.leaftaps.ui.pages.WelcomePage;

public class runCreateLead_PageFactory extends PageFactory_ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc001";
	}

	@Test(dataProvider = "testData")
	public void CreateLead_result (String username, String password, String cName, String fName, String lName) {
		
		new Login_PageFactory(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyLeadId();

	/*	LoginPage page = new LoginPage();
		page.enterUserName(username);
		page.enterPassword(password);
		page.clickLoginButton();

		WelcomePage page1 = new WelcomePage();
		page1.clickCRMSFALink();

		HomePage page2 = new HomePage();
		page2.clickLeads();

		LeadsPage page3 = new LeadsPage();
		page3.clickCreateLead();

		CreateLeadPage page4 = new CreateLeadPage();
		page4.enterCompanyName(cName);
		page4.enterFirstName(fName);
		page4.enterLastName(lName);
		page4.clickCreateLeadButton();

		ViewLeadPage page5 = new ViewLeadPage();
		page5.verifyLeadId(); */

	}

}
