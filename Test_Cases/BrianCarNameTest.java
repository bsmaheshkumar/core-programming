import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * BrianCarName Test class
 * This class is responsible for testing Brian's car name. If OK or Not OK
 * 
 * @author kumar Kaushal
 */
public class BrianCarNameTest {

	/** BrianCarName instance */
	BrianCarName brianCarNameInstance;

	/**
	 * This method will execute before test case execution. We are instantiating
	 * BrianCarName class as well.
	 */
	@Before
	public void setUp() {
		brianCarNameInstance = new BrianCarName();

	}

	/**
	 * This method will execute after test case execution. We are nullifying all
	 * the initialized variable here.
	 */
	@After
	public void tearDown() {
		brianCarNameInstance = null;

	}

	/**
	 * Test Brian Car name with positive input. Happy scenario
	 */
	@Test
	public void testcheckBrianCarName() {
		Assert.assertEquals("OK", brianCarNameInstance.checkBrianCarName("bbbrrriii"));
		Assert.assertEquals("OK", brianCarNameInstance.checkBrianCarName("bri"));

		Assert.assertEquals("OK", brianCarNameInstance.checkBrianCarName("bbbrrriii"));
		Assert.assertEquals("Not OK", brianCarNameInstance.checkBrianCarName("brian"));
		Assert.assertEquals("Not OK", brianCarNameInstance.checkBrianCarName("bbrri"));
	}

	/**
	 * Test Brian Car name with empty input.
	 */
	@Test
	public void testcheckBrianCarNamewithEmptyinput() {
		Assert.assertEquals("Invalid Input", brianCarNameInstance.checkBrianCarName(""));
	}
	
	/**
	 * Test Brian Car name with null input.
	 */
	@Test
	public void testcheckBrianCarNamewithNullinput() {
		Assert.assertEquals("Invalid Input", brianCarNameInstance.checkBrianCarName(null));
	}

}
