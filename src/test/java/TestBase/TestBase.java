package TestBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReportManager;

public class TestBase {

	public ExtentReports report;
	public ExtentTest test;
	public SoftAssert softAssert;

	// using Group method in TestNG use alwaysRun
	@BeforeMethod (alwaysRun = true)
	public void init(ITestResult res) 
	{
		System.out.println("----Before Method----");
		report = ExtentReportManager.getReports();
		// Configuration the test case Name in HTML report
		test = report.createTest(res.getMethod().getMethodName().toUpperCase());
		res.setAttribute("reportObject", test);
		softAssert = new SoftAssert();

	}

	// using Group method in TestNG use alwaysRun
	@AfterMethod (alwaysRun = true)
	public void quit() {
		report.flush();
	}
	// Print the Extent Report
	public void log(String msg) 
	{
		System.out.println(msg);
		test.info(msg);
	}
	public void pass(String msg) 
	{
	System.out.println(msg);
	test.pass(msg);
	}
	public void fail(String msg) 
	{
	System.out.println(msg);
	test.fail(msg);
	}
	public void skip(String msg) 
	{
	System.out.println(msg);
	test.skip(msg);
	}
	
	// Print the SoftAssert in Extent Report
	public void softAssert(String msg)
	{
		fail(msg);
		softAssert.fail(msg);
	}
	
	// print SoftAssert error in Extent and Stop the test Execution
	public void failAndStop(String msg)
	{
	fail(msg);
	softAssert.assertAll();
	}
	
	// Method to log a pass in the Extent Report
    public void extentReportPass(String title, String details) {
        report.createTest(title).pass(details);
    }

    // Method to log a failure in the Extent Report
    public void extentReportFail(String title, String details) {
        report.createTest(title).fail(details);
    }

}
