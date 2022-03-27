package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class PolicyBazaarHomeInsurancePage extends BaseClass{

	public PolicyBazaarHomeInsurancePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Insurance Products '] ")
	private WebElement insuranceProduct;
	
	@FindBy(xpath="(//span[text()='Home Insurance'])[1]")
	private WebElement homeInsurance;
	
	@FindBy(id="citylocation")
	private WebElement lable;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div[1]/input") //     /html/body/div[2]/section/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div[1]/input
	private WebElement nameEditBox;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[3]/div/input")
	private WebElement mobileEditBox;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[4]/div[1]/input")
	private WebElement emailEditBox;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[@class='check format']")
	private WebElement checkFormatName;
	
	@FindBy(xpath="//div[text()='Please enter character only']")
	private WebElement nameErrorCommand;
	
	@FindBy(xpath="//div[text()='Name is required']")
	private WebElement nameRequired;
	
	@FindBy(xpath="//a[@class='check format']")
	private WebElement checkFormatMobile;
	
	@FindBy(xpath="//div[text()='Enter valid mobile number']")
	private WebElement mobileErrorCommand;
	
	@FindBy(xpath="//div[text()='Mobile number is required']")
	private WebElement errorMobileMessage;
	
	@FindBy(xpath="(//a[@class='check format'])")
	private WebElement checkFormateEmail;
	
	@FindBy(xpath="//div[text()='Please enter valid email id']")
	private WebElement emailErrorCommand;
	
	@FindBy(xpath="//div[text()='Email id is required']")
	private WebElement errorEmailMessage;
	
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement btnPrivacyPolicy;
	
	@FindBy(xpath="//a[text()='Terms of Use']")
	private WebElement btnTermsOfUse;
	
	@FindBy(xpath="(//a[text()='Privacy Policy'])[1]")
	private WebElement privacypolicy;
	
	@FindBy(xpath="(//a[text()='Terms Of Use'])[1]")
	private WebElement termsOfUse;
	
	@FindBy(xpath="//a[text()='Intellectual Property Policy']")
	private WebElement intellectualPropertyPolicy;
	
	@FindBy(xpath="//a[text()='Disclaimer']")
	private WebElement disclaimer;
	
	@FindBy(xpath="(//a[text()='ISNP'])[1]")
	private WebElement isnp;

	public WebElement getInsuranceProduct() {
		return insuranceProduct;
	}

	public WebElement getHomeInsurance() {
		return homeInsurance;
	}
	
	public WebElement getLable() {
		return lable;
	}
	
	public WebElement getNameEditBox() {
		return nameEditBox;
	}

	public WebElement getMobileEditBox() {
		return mobileEditBox;
	}

	public WebElement getEmailEditBox() {
		return emailEditBox;
	}
	
	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getCheckFormatName() {
		return checkFormatName;
	}
	
	public WebElement getNameErrorCommand() {
		return nameErrorCommand;
	}

	public WebElement getNameRequired() {
		return nameRequired;
	}
	
	public WebElement getCheckFormatMobile() {
		return checkFormatMobile;
	}
	
	public WebElement getMobileErrorCommand() {
		return mobileErrorCommand;
	}

	public WebElement getErrorMobileMessage() {
		return errorMobileMessage;
	}

	public WebElement getCheckFormateEmail() {
		return checkFormateEmail;
	}
	
	public WebElement getEmailErrorCommand() {
		return emailErrorCommand;
	}

	public WebElement getErrorEmailMessage() {
		return errorEmailMessage;
	}

	public WebElement getBtnPrivacyPolicy() {
		return btnPrivacyPolicy;
	}

	public WebElement getBtnTermsOfUse() {
		return btnTermsOfUse;
	}
	
	
	public WebElement getPrivacypolicy() {
		return privacypolicy;
	}

	public WebElement getTermsOfUse() {
		return termsOfUse;
	}

	public WebElement getIntellectualPropertyPolicy() {
		return intellectualPropertyPolicy;
	}

	public WebElement getDisclaimer() {
		return disclaimer;
	}

	public WebElement getIsnp() {
		return isnp;
	}
	
//	<!-- https://mvnrepository.com/artifact/com.oracle/ojdbc14 -->
//		<dependency>
//			<groupId>com.oracle</groupId>
//			<artifactId>ojdbc14</artifactId>
//			<version>10.2.0.2.0</version>
//		</dependency>
//		<!-- https://mvnrepository.com/artifact/ojdbc14/ojdbc14 -->
//		<dependency>
//			<groupId>ojdbc14</groupId>
//			<artifactId>ojdbc14</artifactId>
//			<version>10.2.0.3.0</version>
//		</dependency>
//		<!-- https://mvnrepository.com/artifact/com.oracle/ojdbc14 -->
//		<dependency>
//			<groupId>com.oracle</groupId>
//			<artifactId>ojdbc14</artifactId>
//			<version>10.2.0.5.0</version>
//		</dependency>
//		<!-- https://mvnrepository.com/artifact/com.oracle/ojdbc14 -->
//		<dependency>
//			<groupId>com.oracle</groupId>
//			<artifactId>ojdbc14</artifactId>
//			<version>10.2.0.4.0</version>
//		</dependency>
	
	
	
}
