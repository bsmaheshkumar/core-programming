/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import github.AlicePrimeString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author samainka
 *
 */
public class AlicePrimeStringTest {

	AlicePrimeString testAlicePrimeString;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testAlicePrimeString = new AlicePrimeString();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		testAlicePrimeString = null;
	}

	@Test
	public void testPrimeString() {
	
		Assert.assertEquals("Yes", testAlicePrimeString.CheckAlicePrimeString("aaabbbbbccc"));
		Assert.assertEquals("Yes", testAlicePrimeString.CheckAlicePrimeString("abababcbcbc"));
		Assert.assertEquals("No", testAlicePrimeString.CheckAlicePrimeString("abababcbb"));
	}
	
	@Test
	public void testNegativeForPrimeString(){
		Assert.assertEquals("Error", testAlicePrimeString.CheckAlicePrimeString(""));
		Assert.assertEquals("Error", testAlicePrimeString.CheckAlicePrimeString(null));
		Assert.assertEquals("Error", testAlicePrimeString.CheckAlicePrimeString("    "));
	}

}
