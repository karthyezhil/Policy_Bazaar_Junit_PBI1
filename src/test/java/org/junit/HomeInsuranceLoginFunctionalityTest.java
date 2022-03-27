package org.junit;

import java.io.IOException;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;

public class HomeInsuranceLoginFunctionalityTest extends BaseClass{

	PolicyBazaarHomeInsurancePage p;

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
	public void tc1LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), readFromExcel(1, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(1, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(1, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test()
	public void tc2LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), readFromExcel(2, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(2, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(2, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test()
	public void tc3LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), readFromExcel(3, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(3, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(3, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test()
	public void tc4LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), readFromExcel(4, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(4, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(4, 2));
		toGetAttributeData();
		xceptionHandling();
	}

	@After()
	public void Finish() {
		toCloseTab();
	}

	@AfterClass()
	public static void endDateAndTime() {
		toGetDateAndTime();
	}

	
	
	
}
