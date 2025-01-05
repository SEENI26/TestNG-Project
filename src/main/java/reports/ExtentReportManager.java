package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager 
{
	static ExtentReports extent;
	public static ExtentReports getReports() 
	{
		if (extent == null) 
		{
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\seeni\\eclipse-workspace\\TestNGExtent-Report\\reports\\TestCase.html");
			// config for theme
			spark.config().setTheme(Theme.DARK);
			// config Document title
			spark.config().setDocumentTitle("TestNG Project");
			// config Report Name
			spark.config().setReportName("TestNG Extent Report");
			extent.attachReporter(spark);
		}
		return extent;
				
	}
	

}
