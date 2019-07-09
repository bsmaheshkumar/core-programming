import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * AlicePrimeStrings Test class.
 * 
 * @author kumar Kaushal
 *
 */
public class AlicePrimeStringsTest {

	/** AlicePrimeStrings class instance */
	AlicePrimeStrings alicePrimeStringInstance;

	/**
	 * This method will execute before test case execution. We are instantiating
	 * AlicePrimeStrings as well.
	 */
	@Before
	public void setUp() {
		alicePrimeStringInstance = new AlicePrimeStrings();
				
	}

	/**
	 * This method will execute after executing all the test cases. We are
	 * nullifying the all the initialized variable.
	 */
	@After
	public void tearDown() {
		alicePrimeStringInstance = null;

	}

	/**
	 * Test check prime string with positive input.
	 */
	@Test
	public void testCheckPrimeString() {
		Assert.assertEquals("Yes", alicePrimeStringInstance.checkPrimeString("ababb")); // a = 2, b =3, Both are prime
		Assert.assertEquals("No", alicePrimeStringInstance.checkPrimeString("abcab")); // a occurred 1s which is not prime
		
		Assert.assertEquals("No", alicePrimeStringInstance.checkPrimeString("a"));
		Assert.assertEquals("No", alicePrimeStringInstance.checkPrimeString("ab"));
		Assert.assertEquals("No", alicePrimeStringInstance.checkPrimeString("abcdab"));
		Assert.assertEquals("Yes", alicePrimeStringInstance.checkPrimeString("aaabbcc"));
	}

	/**
	 * Test check prime string with empty input.
	 */
	@Test
	public void testCheckPrimeStringWithEmptyString() {
		Assert.assertEquals("Invalid Input", alicePrimeStringInstance.checkPrimeString(""));
	}
	
	/**
	 * Test check prime string with null input.
	 */
	@Test
	public void testCheckPrimeStringWithNullString() {
		Assert.assertEquals("Invalid Input", alicePrimeStringInstance.checkPrimeString(null));
	}

}