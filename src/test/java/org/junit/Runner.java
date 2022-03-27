package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {

	@Test
	public void ExecuteAll() {
		Result r = JUnitCore.runClasses(PolicyBazaarHomeInsurance.class,HomeInsuranceNameEditBox.class,HomeInsuranceMobileEditBox.class,HomeInsuranceEmailEditBox.class,HomeInsuranceLoginFunctionalityTest.class,HomeInsuranceLoginFunctionalityTestUsingScanner.class,HomeInsurancePrivacyPolicyAndTermsOfUse.class);
		System.out.println("\nExecution Results : ");

		System.out.println("Failure Count : " + r.getFailureCount());
		System.out.println("Ignore Count :" + r.getIgnoreCount());
		System.out.println("Run Count : " + r.getRunCount());
		System.out.println("Run Time : " + r.getRunTime());

		System.out.println("Status : " + r.wasSuccessful());

		System.out.println("Pass Count : " + (r.getRunCount() - r.getFailureCount()));

		List<Failure> allFail = r.getFailures();

		System.out.println("\nFailed Test Cases : ");

		for (Failure fail : allFail) {
			System.out.println(fail);
		}
	}

}
