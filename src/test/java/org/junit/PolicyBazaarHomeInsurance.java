package org.junit;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;

public class PolicyBazaarHomeInsurance extends BaseClass {

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
	public void policyBazaar() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		String text = toGetText(p.getHomeInsurance());
		System.out.println("Expected Result : Home Insurance , Actual Result : " + text);
		String textLable = toGetText(p.getLable());
		System.out.println("Expected Result : Tell us your Details , Actual Result : " + textLable);

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
