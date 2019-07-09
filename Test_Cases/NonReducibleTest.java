
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * NonReducible Test class.
 * 
 * @author kumar Kaushal
 *
 */
public class NonReducibleTest {

	/** NonReducible class instance */
	NonReducible nonReducibleInstance;

	/**
	 * This method will execute before test case execution. initialization of
	 * variable is done here
	 */
	@Before
	public void setUp() {
		nonReducibleInstance = new NonReducible();
	}

	/**
	 * This method will execute after executing all the test cases. We are
	 * nullifying the all the initialized variable.
	 */
	@After
	public void tearDown() {
		nonReducibleInstance = null;
	}

	/**
	 * Test Reduced String With positive input.
	 */
	@Test
	public void testReducedStringWithOperationCountPositive() {
		Assert.assertEquals(new NonReducible(3, "abd"), nonReducibleInstance.findReducedStringAndOperationCount("aaabccddd"));
		Assert.assertEquals(new NonReducible(2, "abcd"), nonReducibleInstance.findReducedStringAndOperationCount("abcccddd")); 
	}

	/**
	 * Test Reduced String With null input.
	 */
	@Test
	public void testReducedStringWithOperationCountPositiveWithNullInput() {
		Assert.assertEquals(new NonReducible(0, ""), nonReducibleInstance.findReducedStringAndOperationCount(null)); 
	}

	/**
	 * Test Reduced String With empty input.
	 */
	@Test
	public void testReducedStringWithOperationCountPositiveWithEmptyInput() {
		Assert.assertEquals(new NonReducible(0, ""), nonReducibleInstance.findReducedStringAndOperationCount("")); 
	}

}
