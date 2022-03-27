package org.junit;
import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage; 

public class HomeInsuranceMobileEditBox extends BaseClass {

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
		PolicyBazaarHomeInsurancePage p = new PolicyBazaarHomeInsurancePage();
		toMoveToElement(p.getInsuranceProduct());
		toClick(p.getHomeInsurance());
	}

	@Test()
	public void tcMobileEditBox1() {
		System.out.println("mobileEditBoxValidationUsingTenDigit");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "8542695874");
		commandMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox2() {
		System.out.println("mobileEditBoxValidationUsingNineDigit");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "658742356");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox3() {
		System.out.println("mobileEditBoxValidationUsingElevenDigit");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "95367482453");
		String attValue = toGetAttributeWithReturn(p.getMobileEditBox());
		if (attValue.length() <=10) {
			System.out.println("Given values Entered");
		}
		else {
			System.out.println("More than 10 digit values not accepted");
		}
	}
	
	@Test()
	public void tcMobileEditBox4() {
		System.out.println("mobileEditBoxValidationUsingFourDigits");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "7542");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox5() {
		System.out.println("mobileEditBoxValidationUsingSpace");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "  ");
		errorMessageMobileNumberEditBox();
	}
	
	@Test()
	public void tcMobileEditBox6() {
		System.out.println("mobileEditBoxValidationUsingTenDigitAsZero");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "0000000000");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox7() {
		System.out.println("mobileEditBoxValidationUsingTenDigitAsEight");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "8888888888");
		commandMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox8() {
		System.out.println("mobileEditBoxValidationUsingTenDigitWithSomeSpaceBetweenNumber");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "785 986 85");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox9() {
		System.out.println("mobileEditBoxValidationUsingTenCharacter");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "Abcdefghij");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox10() {
		System.out.println("mobileEditBoxValidationUsingSpecialCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "!@#$%^&**@");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox11() {
		System.out.println("mobileEditBoxValidationUsingTenCharacterWithSpecialCharacter");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "Ab$%rd^&t@");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox12() {
		System.out.println("mobileEditBoxValidationUsingTenNumbersWithSpecialCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "87654#$%^&");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox13() {
		System.out.println("mobileEditBoxValidationUsingTendigitNonIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "1238569745");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox14() {
		System.out.println("mobileEditBoxInValidationUsingdigitTenNonIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "2254687741");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox15() {
		System.out.println("mobileEditBoxValidationUsingTendigitNonIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "3587496125");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox16() {
		System.out.println("mobileEditBoxValidationUsingTendigitNonIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "4875698231");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox17() {
		System.out.println("mobileEditBoxValidationUsingTendigitNonIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "5789461234");
		errorMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox18() {
		System.out.println("mobileEditBoxValidationUsingTendigitIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "63744607764");
		commandMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox19() {
		System.out.println("mobileEditBoxValidationUsingTendigitIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "7708506788");
		commandMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox20() {
		System.out.println("mobileEditBoxValidationUsingTendigitIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "9964626620");
		commandMessageMobileEditBox();
	}
	
	@Test()
	public void tcMobileEditBox21() {
		System.out.println("mobileEditBoxValidationUsingTendigitIndianMobileNumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), "9994466709");
		commandMessageMobileEditBox();
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
