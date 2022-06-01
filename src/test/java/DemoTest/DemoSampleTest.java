package DemoTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoSampleTest {
	
	@Test
	public void testName() throws Exception 
	{
		Reporter.log("GITBASH",true);
		Reporter.log("HEYY",true);
		Reporter.log("BYE",true);
	}

}
