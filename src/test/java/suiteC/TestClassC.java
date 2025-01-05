package suiteC;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassC extends TestBase {

	@Test
	public void testC() throws InterruptedException {
		log("Starting TestC");
		Thread.sleep(1000);
		log("Ending TestC");
	}
}
