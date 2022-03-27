package org.junit;

import org.pojo.PolicyBazaarHomeInsurancePage;
import org.helper.BaseClass;


public class HomeInsuranceEmailEditBox extends BaseClass{

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
	public void tcEmailEditBox1() {
		System.out.println("emailEditBoxValidationUsingValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "abc123@gmail.com");
		commandMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox2() {
		System.out.println("emailEditBoxValidationUsingValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "erty.ertg@ty.df");
		commandMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox3() {
		System.out.println("emailEditBoxValidationUsingValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "ak47@gmail.com");
		commandMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox4() {
		System.out.println("emailEditBoxValidationUsingValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "12345@yahho.co.in");
		commandMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox5() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "abc_abcqwe@yu.in");
		commandMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox6() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "uhj#$87@a.co");
		errorMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox7() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "a@you.in");
		errorMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox8() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "t@yahoo.in");
		errorMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox9() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "123.234@co");
		errorMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox10() {
		System.out.println("emailEditBoxValidationUsingInValidEmailId");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "@drft@gmail.com");
		errorMessageEmailEditBox();
	}
	
	@Test()
	public void tcEmailEditBox11() {
		System.out.println("emailEditBoxValidationUsingBlankSpace");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getEmailEditBox(), "  ");
		errorMessageEmailIdEditBox();
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
