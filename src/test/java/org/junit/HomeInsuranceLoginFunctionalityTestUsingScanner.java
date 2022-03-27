package org.junit;

import java.io.IOException;
import java.sql.SQLException;

import org.database.HomeInsuranceData;
import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;

public class HomeInsuranceLoginFunctionalityTestUsingScanner extends BaseClass {

	
	PolicyBazaarHomeInsurancePage p;
	HomeInsuranceData h;

	@BeforeClass
	public static void startDateAndTime() {
		toGetDateAndTime();
	}

	@Before()
	public void initiating() {
		launchBrowser();
		loadUrl("https://www.policybazaar.com");
		maxBrowser();
		p = new PolicyBazaarHomeInsurancePage();
		toMoveToElement(p.getInsuranceProduct());
		toClick(p.getHomeInsurance());
		
	}

	@Test()
	public void loginFunctionalityTestUsingScanner() throws IOException, ClassNotFoundException, SQLException {
		p=new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(8);
		driver.manage().window().minimize();
		toFillTextBox(p.getNameEditBox(), scanName());
		toFillTextBox(p.getMobileEditBox(), scanMobileNo());
		toFillTextBox(p.getEmailEditBox(), scanEmailId());
		toGetAttributeData();
		xceptionHandling();	
		toClick(p.getContinueButton());
		h =new HomeInsuranceData();
		h.sendingValuesToDatabase("home_insurance_enquiry", "first_name", "mobile_no", "email_id");
	}
	
	@After()
	public void Finish() {
		//toCloseTab();
	}

	@AfterClass()
	public static void endDateAndTime() {
		toGetDateAndTime();
	}
	
	
	
}
