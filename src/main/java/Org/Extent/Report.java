package Org.Extent;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
// Create a Report
public class Report 
{
public static void main(String[] args)
{
// created object class  
ExtentReports extent = new ExtentReports();

File f = new File("C:\\Users\\seeni\\eclipse-workspace\\TestNGExtent-Report\\reports\\report1.html"); 
ExtentSparkReporter exspark = new ExtentSparkReporter(f);

extent.attachReporter(exspark);
extent.flush();
}
}