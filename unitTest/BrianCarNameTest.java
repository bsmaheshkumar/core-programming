package test;

import github.BrianCarName;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrianCarNameTest {

	BrianCarName brianCarName;
	@Before
	public void setUp() throws Exception {
		brianCarName = new BrianCarName();
	}

	@After
	public void tearDown() throws Exception {
		brianCarName = null;
	}

	@Test
	public void testPositiveCarNameFormat() {
		Assert.assertEquals("OK", brianCarName.BrianCarNameFormat("bbbcccddd"));
		Assert.assertEquals("Not OK", brianCarName.BrianCarNameFormat("bbbcccdddd"));
		Assert.assertEquals("Not OK", brianCarName.BrianCarNameFormat("brian"));
		
	}
	
	@Test
	public void testNegativeCarNameFormat() {
		Assert.assertNotEquals("OK", brianCarName.BrianCarNameFormat(""));
		Assert.assertNotEquals("OK", brianCarName.BrianCarNameFormat("   "));
		Assert.assertNotEquals("OK", brianCarName.BrianCarNameFormat(null));
	}

}
