package suiteC;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassCC extends TestBase {

	@Test
	public void testCC() throws InterruptedException {
		log("Starting TestCC");
		Thread.sleep(1000);
		log("Ending TestCC");
	}
}
