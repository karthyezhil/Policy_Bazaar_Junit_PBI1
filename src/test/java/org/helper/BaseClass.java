package org.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.datadriven.DataDriven;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends DataDriven {

	public static WebDriver driver;
	public static PolicyBazaarHomeInsurancePage p;
	public static Scanner s;
	

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void minBrowser() {
		driver.manage().window().minimize();
	}

	public static void toGetPageTitle() {
		String title = driver.getTitle();
		System.out.println("Current page title : " + title);
	}

	public static String toGetCurrentUrl() {
		String pageUrl = driver.getCurrentUrl();
		return pageUrl;
	}

	public static void toGetDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void toClick(WebElement e) {
		e.click();
	}

	public static String toGetText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static void toMoveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void toDoubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void toGetAttribute(WebElement e) {
		String attText = e.getAttribute("value");
		System.out.println("Entered value : " + attText);
		
	}
	
	public static String toGetAttributeWithReturn(WebElement e) {
		String attText = e.getAttribute("value");
		System.out.println("Entered value : " + attText);
		return attText;
	}

	public static void toFillTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void commandMessageNameEditBox() {

		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getNameEditBox());
		WebElement check = p.getCheckFormatName();
		toDoubleClick(check);
		System.out.println("Entered Name accepted ");
	}
	
	public static void commandMessageMobileEditBox() {

		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getMobileEditBox());
		WebElement check = p.getCheckFormatMobile();
		toDoubleClick(check);
		System.out.println("Entered Number accepted ");
	}
	
	public static void commandMessageEmailEditBox() {
		p=new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getEmailEditBox());
		WebElement check = p.getCheckFormateEmail();
		toDoubleClick(check);
		System.out.println("Entered Email accepted ");
	}

	public static void errorMessageNameEditBox() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getNameEditBox());
		String errorText = toGetText(p.getNameErrorCommand()); 
		System.out.println("Error Message : "+errorText);
	}
	
	public static void errorMessageMobileEditBox() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getMobileEditBox());
		String errorText = toGetText(p.getMobileErrorCommand()); 
		System.out.println("Error Message : "+errorText);
	}
	
	public static void errorMessageMobileNumberEditBox() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getMobileEditBox());
		String errorText = toGetText(p.getErrorMobileMessage()); 
		System.out.println("Error Message : "+errorText);
	}
	
	public static void  errorMessageEmailEditBox() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getEmailEditBox());
		String errorText = toGetText(p.getEmailErrorCommand()); 
		System.out.println("Error Message : "+errorText);
	}
	
	public static void errorMessageEmailIdEditBox() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getEmailEditBox());
		String errorText = toGetText(p.getErrorEmailMessage());  
		System.out.println("Error Message : "+errorText);
		
	}
	
	public static void xceptionHandling() {
		try {
			if (p.getMobileErrorCommand().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled np");
			}
			else if(p.getErrorMobileMessage().isDisplayed()){
				System.out.println("CONTINUE button not Enabled np");
			}
			else if(p.getEmailErrorCommand().isDisplayed()){
				System.out.println("CONTINUE button not Enabled np");
			}
			else if(p.getErrorEmailMessage().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled np");
			}
			else {
				System.out.println("CONTINUE button Enabled ai");
			}
				
			}
		
		catch (NullPointerException e) {
			System.out.println("CONTINUE button not Enabled");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("CONTINUE button Enabled");
		}
		
		catch (NoSuchElementException e) {
			System.out.println("CONTINUE button Enabled");
		}
		
		catch (Exception e) {
			System.out.println("CONTINUE button Enabled");
		}

	}
	
//	System.out.println(p.getMobileErrorCommand().getText());
//	System.out.println(p.getErrorMobileMessage().getText());
//	System.out.println(p.getEmailErrorCommand().getText());
//	System.out.println(p.getErrorEmailMessage().getText());
	
	public static  void toGetAttributeData(){
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttributeWithReturn(p.getNameEditBox());
		toGetAttributeWithReturn(p.getMobileEditBox());
		toGetAttributeWithReturn(p.getEmailEditBox());
		
	}
	
	public static void toImplicitlyWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public static void toApplyWebDriverWait(int timeout,WebElement e) {
		WebDriverWait w=new WebDriverWait(driver,timeout);
		w.until(ExpectedConditions.visibilityOf(e));

	}
	
	public static  void toHandleWindows() {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String eachWindowId : allWindowId) {
			if(!eachWindowId.equals(parentWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
	}
	
	public static  void toHandleWindows(int windowNo) {
		Set<String> allWindowId = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(allWindowId);
		driver.switchTo().window(li.get(windowNo));
		
	}
	
	public static  void jsClick(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", e);
	}
	public static  void policyContent(String name) {
		System.out.println("\nAvaliable content Under "+name+" :  \n"+p.getPrivacypolicy().getText()+"\n"+p.getTermsOfUse().getText()+"\n"+p.getIntellectualPropertyPolicy().getText()+"\n"+p.getDisclaimer().getText()+"\n"+p.getIsnp().getText());
	}

	public static String scanName() {
		s=new Scanner(System.in);
		System.out.println("Enter First Name:" );
		String firstName = s.nextLine();
		return firstName;
	}
	
	public static String scanMobileNo() {
		s=new Scanner(System.in);
		System.out.println("Enter Mobile No:" );
		long num =  s.nextLong();
		String mobileNo = String.valueOf(num);
		return mobileNo;
	}
	
	public static String scanEmailId() {
		s=new Scanner(System.in);
		System.out.println("Enter Email Id:" );
		String emailId = s.next();
		return emailId;
	}
	
	public static void toCloseTab() {
		driver.quit();
	}

	public static void toCloseBrowser() {
		driver.close();
	}
	
	

}
