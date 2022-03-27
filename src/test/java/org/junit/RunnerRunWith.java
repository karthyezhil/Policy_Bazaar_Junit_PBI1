package org.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PolicyBazaarHomeInsurance.class,HomeInsuranceNameEditBox.class,HomeInsuranceMobileEditBox.class,HomeInsuranceEmailEditBox.class,HomeInsuranceLoginFunctionalityTest.class,HomeInsuranceLoginFunctionalityTestUsingScanner.class,HomeInsurancePrivacyPolicyAndTermsOfUse.class})
public class RunnerRunWith {

}
