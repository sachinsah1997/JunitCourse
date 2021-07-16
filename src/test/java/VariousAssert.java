import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VariousAssert {
	
	@Test
	public void testAssertions() {
		
		String str1 = new String("Sachin");
		String str2 = new String("Sachin");
		String str3 = null;
		String str4 = "edu";
		String str5 = "edu";
		
		int val1 = 5;
		int val3 = 10;
		
		String[] expectedArray = {"one", "two"};
		String[] actualArray = {"one", "two"};
		
		//various Assertions
		
		assertArrayEquals(expectedArray, actualArray);
		assertTrue(val1<val3);
		//assertNotNull(str3);
		//assertEquals(str1, str2);
		
	}
}
