package listerners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener implements ITestListener
{
	// For Passed TEST
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("****-- Test Passed --****");
		ExtentTest test = (ExtentTest) result.getAttribute("reportObject");
		test.log(Status.INFO,"Test Case Name : "+ result.getName());
		test.pass("Test STATUS is Success");
	}
	// For Failed TEST
	public void onTestFailure(ITestResult result)
	{
		//System.out.println("****-- Test Failed --****");
		//System.out.println("Test Name:" + result.getName());
		//System.out.println("ERROR : " + result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest) result.getAttribute("reportObject");
		test.log(Status.INFO,"Test Case Name : "+ result.getName());
		test.fail(result.getThrowable().getMessage());
	}

}
