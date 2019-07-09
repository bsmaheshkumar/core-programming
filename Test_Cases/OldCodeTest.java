import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * OldCodeTest Class.
 * 
 * @author kumar Kaushal
 */
public class OldCodeTest {

	/** OldCode instance */
	OldCode oldCodeInstance;

	/** Set up - Instantiate OldCode*/
	@Before
	public void setUp() {
		oldCodeInstance = new OldCode();
	}

	@After
	public void tearDown() {
		oldCodeInstance = null;
	}

	/**
	 * test ConvertOldCodeForNewVersionCompiler API for expected behavior
	 */
	@Test
	public void testConvertOldCodeForNewVersionCompiler() {
		List<String> oldCodes = new ArrayList<String>();
		oldCodes.add("int t; //variable t, t->a=0;  //t->a does something, return 0;");
		oldCodes.add("int t->a; //variable t, t->a=0;");
		oldCodes.add("int i->j, k->l;  //variable i->j, k->l");
		
		List<String> expectedUpdatedCodes = new ArrayList<String>();
		expectedUpdatedCodes.add("int t; //variable t, t->a=0;  //t->a does something, return 0;");
		expectedUpdatedCodes.add("int t.a; //variable t, t->a=0;");
		expectedUpdatedCodes.add("int i.j, k.l;  //variable i->j, k->l");

		Assert.assertEquals(expectedUpdatedCodes, oldCodeInstance.convertOldCodeForNewVersionCompiler(oldCodes));
	}

	/**
	 * Test for empty list.
	 */
	@Test
	public void testConvertOldCodeForNewVersionCompilerForEmptyList() {
		Assert.assertEquals(new ArrayList<String>(), oldCodeInstance.convertOldCodeForNewVersionCompiler(new ArrayList<String>()));
	}

	/**
	 * Test for null list.
	 */
	@Test
	public void testConvertOldCodeForNewVersionCompilerForNullList() {
		Assert.assertEquals(new ArrayList<String>(), oldCodeInstance.convertOldCodeForNewVersionCompiler(null));
	}
}