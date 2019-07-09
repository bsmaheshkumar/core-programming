import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * ShoppingTest class.
 * 
 * @author kumar Kaushal
 */
public class ShoppingTest {

	/** shopping class instance */
	Shopping shoppingInstance;

	/**
	 * This method will execute before test case execution. We are instantiating
	 * Shopping class here.
	 */
	@Before
	public void setUp() {
		shoppingInstance = new Shopping();
	}

	/**
	 * This method will execute after test case execution. We are nullifying the
	 * all the initialized variable.
	 */
	@After
	public void tearDown() {
		shoppingInstance = null;
	}

	/**
	 * Test case for total amount spent by Roy. Happy scenario.
	 */
	@Test
	public void testTotalAmountspentByRoy() {
		int[] mrpsOfProducts = { 5, 10 };
		Assert.assertEquals(8, shoppingInstance.findTotalAmountspentByRoy(mrpsOfProducts));
		
		mrpsOfProducts = new int[] { 0, 1, 5, 10, 50, 17 }; // 1 + 8 + 48
		Assert.assertEquals(57, shoppingInstance.findTotalAmountspentByRoy(mrpsOfProducts));
		
		mrpsOfProducts = new int[] { 0, 1, 3, 4 }; 
		Assert.assertEquals(3, shoppingInstance.findTotalAmountspentByRoy(mrpsOfProducts));
	}

	/**
	 * Test case for total amount spent by Roy with null input.
	 */
	@Test
	public void testTotalAmountspentByRoyWithNullInput() {
		Assert.assertEquals(0, shoppingInstance.findTotalAmountspentByRoy(null));
	}

	/**
	 * Test case for total amount spent by Roy with empty input.
	 */
	@Test
	public void testTotalAmountspentByRoyWithEmptyInput() {
		int[] mrpsOfProducts = {};
		Assert.assertEquals(0, shoppingInstance.findTotalAmountspentByRoy(mrpsOfProducts));
	}
}
