package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "DataProviderSuiteA")
	public void testA(String arg1, String arg2) throws InterruptedException {
		log("Starting TestA");
		boolean isUsernameValid = true;
		boolean isPasswordValid = true;

		// Username validation
		log("UserName -- " + arg1);
		if (!arg1.equals("username_DEMO")) {
			isUsernameValid = false;
			softAssert("Validation failure: " + arg1 + " does not equal username_DEMO");
			extentReportFail("Username validation failed", "Actual: " + arg1 + ", Expected: username_DEMO");
		} else {
			extentReportPass("Username validation passed", "Actual: " + arg1);
		}

		// Password validation
		log("PassWord -- " + arg2);
		if (!arg2.equals("password_DEMO")) {
			isPasswordValid = false;
			softAssert("Validation failure: " + arg2 + " does not equal password_DEMO");
			extentReportFail("Password validation failed", "Actual: " + arg2 + ", Expected: password_DEMO");
		} else {
			extentReportPass("Password validation passed", "Actual: " + arg2);
		}

		// Log overall result
		if (!isUsernameValid && isPasswordValid) {
			log("Test result: Username validation failed, but Password validation passed.");
		} else if (isUsernameValid && !isPasswordValid) {
			log("Test result: Username validation passed, but Password validation failed.");
		} else if (!isUsernameValid && !isPasswordValid) {
			log("Test result: Both Username and Password validation failed.");
		} else {
			log("Test result: Both Username and Password validation passed.");
		}

		Thread.sleep(1000);

		// Assert all validations
		softAssert.assertAll();

		log("Ending TestA");
	}
}