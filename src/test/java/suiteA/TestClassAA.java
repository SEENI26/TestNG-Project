package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassAA extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "DataProviderSuiteA")
	public void testAA(String arg1, String arg2) throws InterruptedException {
		log("Starting TestAA");
		log("UserName --" + arg1);
		log("PassWord --" + arg2);
		Thread.sleep(1000);
		log("Ending TestAA");
	}
}
