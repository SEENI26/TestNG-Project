package suiteB;

import org.testng.annotations.Test;
import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassB extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "DataProviderSuiteB", groups = {"B-Group"})
	public void testB(String arg1, String arg2) throws InterruptedException {
		log("Starting TestB");
		log("UserName --" + arg1);
		log("PassWord --" + arg2);
		Thread.sleep(1000);
		log("Ending TestB");
	}
}
