package org.junit;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;

public class HomeInsuranceNameEditBox extends BaseClass {

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
	public void tcNameEditBox1() {
		System.out.println("nameEditBoxValidationUsingTwoCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "aa");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox2() {
		System.out.println("\nnameEditBoxValidationUsingThreeCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "ABI");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox3() {
		System.out.println("\nnameEditBoxValidationUsingFourCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Ramu");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox4() {
		System.out.println("\nnameEditBoxValidationUsingFortyNineCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Adolph Blaine Charles David Earl Frederick Gerald");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox5() {
		System.out.println("\nnameEditBoxValidationUsingFiftyCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Adolph  Blaine Charles David Earl Frederick Gerald");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox6() {
		System.out.println("\nnameEditBoxValidationUsingFiftyOneCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Adolph  Blaine  Charles David Earl Frederick Gerald");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox7() {
		System.out.println("\nnameEditBoxValidationUsingElevenCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Christopher");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox8() {
		System.out.println("\nnameEditBoxValidationUsingTwentyThreeCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Adolph Blaine Charles David Earl Freder");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox9() {
		System.out.println("\nnameEditBoxValidationUsingThirteenCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "JeffreyDahmer");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox10() {
		System.out.println("\nnameEditBoxValidationUsingFourtySevenCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Adolph Blaine Charles David Ear Frederick Geral ");
		commandMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox11() {
		System.out.println("\nnameEditBoxValidationUsingSpecialCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "%$@!&");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox12() {
		System.out.println("\nnameEditBoxValidationUsingMumber ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "854236");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox13() {
		System.out.println("\nnameEditBoxValidationUsingSingleSpace ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "A_b");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox14() {
		System.out.println("\nameEditBoxValidationUsingDoubleSpace ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "R__u");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox15() {
		System.out.println("\nnameEditBoxValidationUsingAlphaNumeric ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Test852");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox16() {
		System.out.println("\nnameEditBoxValidationUsingSpecialCharacterAndCharacter ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "%$#Rec");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox17() {
		System.out.println("\nnameEditBoxValidationUsingCharacterAndSpecialCharacterAndNumbers ");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "Yr65$#fg%^");
		errorMessageNameEditBox();
	}

	@Test()
	public void tcNameEditBox18() {
		System.out.println("\nnameEditBoxValidationUsingBlankSpace");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), "  ");
		toGetAttribute(p.getNameEditBox());
		String err = toGetText(p.getNameRequired());
		System.out.println("Error Message : "+err);
		
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
