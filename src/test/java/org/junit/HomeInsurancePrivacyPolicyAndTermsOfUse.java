package org.junit;

import org.pojo.PolicyBazaarHomeInsurancePage;

import java.util.Set;

import org.helper.BaseClass;
public class HomeInsurancePrivacyPolicyAndTermsOfUse extends BaseClass{

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
	public void tc1homeInsurancePrivacyPolicyContentCheck() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		toClick(p.getBtnPrivacyPolicy());
		toHandleWindows();
		policyContent("Privacy Policy");
		
	}
	
	@Test()
	public void tc2homeInsuranceTermsOfUseContentCheck() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		toClick(p.getBtnTermsOfUse());
		toHandleWindows();
		policyContent("Terms of Use");	
	}
	
//	@Test()
//	public void tc3homeInsuranceContentCheck() {
//		p = new PolicyBazaarHomeInsurancePage();
//		toImplicitlyWait(10);
//		jsClick(p.getBtnPrivacyPolicy());
//		toHandleWindows(1);
//		policyContent("Privacy Policy");
//		toClick(p.getBtnTermsOfUse());
//		toHandleWindows(2);
//		policyContent("Terms of Use");	
//	}
	

	@After()
	public void Finish() {
		toCloseTab();
	}

	@AfterClass()
	public static void endDateAndTime() {
		toGetDateAndTime();
	}

}
