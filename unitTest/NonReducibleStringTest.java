package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import github.NonReducible;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NonReducibleStringTest {

	NonReducible nonReducible ;

	@Before
	public void setUp() throws Exception {
		nonReducible = new NonReducible();
	}

	@After
	public void tearDown() throws Exception {
		nonReducible = null;
	}

	@Test
	public void NonReducibleStringPositiveTest() {
		Assert.assertEquals("ad", nonReducible.NonReducibleString("aaabbccddd"));
		Assert.assertEquals("abcd", nonReducible.NonReducibleString("aaabcddd"));
	}
	
	@Test
	public void NonReducibleStringNegativeTest() {
		Assert.assertNull(nonReducible.NonReducibleString(""));
		Assert.assertNull(nonReducible.NonReducibleString(null));
	}

}
