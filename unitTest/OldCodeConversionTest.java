package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;
import github.OldCode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OldCodeConversionTest {

	OldCode oldCode;
	@Before
	public void setUp() throws Exception {
		oldCode = new OldCode();
	}

	@After
	public void tearDown() throws Exception {
		oldCode = null;
	}

	@Test
	public void OldCodeConversionDoneTest() {
		ArrayList<String> input = new ArrayList<String>();
		input.add("t->0//t represents time value");
		input.add("//t represents time value t->1");
		
		ArrayList<String> output = new ArrayList<String>();
		output.add("t.0//t represents time value");
		output.add("//t represents time value t->1");
		
		assertArrayEquals(output.toArray(), oldCode.oldCodeToNewCode(input).toArray());
		
	}
}
