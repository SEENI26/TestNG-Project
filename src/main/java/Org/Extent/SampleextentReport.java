package Org.Extent;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleextentReport {
	@Test
	private void tc1() throws IOException 
	{
	    
	        ExtentReports extent = new ExtentReports();
	        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\seeni\\eclipse-workspace\\TestNGExtent-Report\\reports\\Sample.html");
	        final File CONF = new File("extentconfig.xml");
	        spark.loadXMLConfig(CONF);

	        
	        extent.attachReporter(spark);


	        ExtentTest logintest = extent.createTest("Facebook Test");
	        logintest.info("passing Username");
	        logintest.info("passing passwrod");
	        logintest.info("click sumbit button");
	        logintest.info("close");
	        
	 
	        extent.flush();
	    }

}
