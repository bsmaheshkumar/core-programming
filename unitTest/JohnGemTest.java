package test;

import github.JohnGem;

import java.util.ArrayList;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JohnGemTest {

	JohnGem johnGem;
	@Before
	public void setUp() throws Exception {
		johnGem = new JohnGem();
	}

	@After
	public void tearDown() throws Exception {
		johnGem = null;
	}

	@Test
	public void JohnGemElementCount() {

	ArrayList<String> inputList = new ArrayList<String>();
	inputList.add("abcde");
	inputList.add("abcdefg");
	inputList.add("cbi");
	
	Assert.assertEquals(2, johnGem.JohnGemCheck(inputList));
	}
	
	@Test
	public void JohnGemElementCountEmptyList() {
		ArrayList<String> emptyList = new ArrayList<String>();
		Assert.assertNotSame(2, johnGem.JohnGemCheck(emptyList));
		Assert.assertSame(-1, johnGem.JohnGemCheck(emptyList));
	}

}
