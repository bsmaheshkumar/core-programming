import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for JohnGem class.
 */
public class JohnGemTest {

	/**
	 * JohnGem class instance
	 */
	JohnGem johnGemInstance;

	/**
	 * This method will execute before test case execution. initialization of
	 * variable is done here
	 */
	@Before
	public void setUp() {
		johnGemInstance = new JohnGem();
	}

	/**
	 * This method will execute after executing all the test cases. We are
	 * nullifying the all the initialized variable.
	 */
	@After
	public void tearDown() {
		johnGemInstance = null;
	}

	/**
	 * Test count gem positive.
	 */
	@Test
	public void testFindNumberofGemElement() {
		List<String> rocks = new ArrayList<String>();
		rocks.add("abcdde");
		rocks.add("baccd");
		rocks.add("eeabg");
		Assert.assertEquals(2, johnGemInstance.findNumberofGemElement(rocks));
	}

	/**
	 * Test count gem negative.
	 */
	@Test
	public void findNumberofGemElementWithEmptyInput() {
		Assert.assertEquals(0, johnGemInstance.findNumberofGemElement(new ArrayList<String>()));
	}

	/**
	 * Test count gem negative.
	 */
	@Test
	public void findNumberofGemElementWithNullInput() {
		Assert.assertEquals(0, johnGemInstance.findNumberofGemElement(null));
	}
	
}
