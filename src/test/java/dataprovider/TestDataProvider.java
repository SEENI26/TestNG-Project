package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

// separate  data Provider  for Each Test Suite
// External Data Source like -- JSON ,Excel ,XML
public class TestDataProvider 
{
@DataProvider
// For suiteA
public static Object[][] DataProviderSuiteA(Method method) 
{
	System.out.println("Test Method Name -- " + method.getName());
	Object data [][] = null;
	if (method.getName().toUpperCase().equals("TESTA"))
	{
		// Initialize a 2x2 array for TestA
		// This is the Argument *arg* value 
		data = new Object[2][2];
		data [0][0] ="username_DEMO";
		data [0][1] ="password_DEMO";
		
		data [1][0] ="UserName 2";
		data [1][1] ="password_DEMO";
	}
	else if (method.getName().toUpperCase().equals("TESTAA")) 
	{
		// Initialize a 2x2 array for TestAA
		data = new Object[2][2];
		data [0][0] ="UserName 11";
		data [0][1] ="Password 11";
		
		data [1][0] ="UserName 22";
		data [1][1] ="Password 22";
	}
	
	return data;
}
@DataProvider
//For suiteB
public static Object[][] DataProviderSuiteB(Method method) {
 System.out.println("Test Method Name -- " + method.getName());
 Object data[][] = null;

 if (method.getName().toUpperCase().equals("TESTB")) {
     // Initialize a 2x2 array for testB
     data = new Object[2][2];
     data[0][0] = "UserName 100";
     data[0][1] = "Password 101";

     data[1][0] = "UserName 200";
     data[1][1] = "Password 201";

 } else if (method.getName().toUpperCase().equals("TESTBB")) {
     // Initialize a 2x2 array for testBB
     data = new Object[2][2];
     data[0][0] = "UserName 111";
     data[0][1] = "Password 112";

     data[1][0] = "UserName 222";
     data[1][1] = "Password 223";
 }

 return data;
}

}