package suiteB;

import org.testng.annotations.Test;

import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassBB extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "DataProviderSuiteB")
	public void testBB(String arg1, String arg2) throws InterruptedException {
		log("Starting TestBB");
		log("UserName --" + arg1);
		log("PassWord --" + arg2);
		Thread.sleep(1000);
		log("Ending TestBB");
	}
}
