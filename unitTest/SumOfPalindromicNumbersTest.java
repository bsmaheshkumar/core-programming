package test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import github.SumOfPalindronicNumbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumOfPalindromicNumbersTest {

	SumOfPalindronicNumbers sumOfPalindronicNumbers ;
	@Before
	public void setUp() throws Exception {
		sumOfPalindronicNumbers = new SumOfPalindronicNumbers();
	}

	@After
	public void tearDown() throws Exception {
		sumOfPalindronicNumbers = null;
	}

	@Test
	public void sumOfPalindronicNumbersTestPositive() {
		Assert.assertEquals(0, sumOfPalindronicNumbers.calculateSumOfPalindromes(-1, 1));
		Assert.assertEquals(272, sumOfPalindronicNumbers.calculateSumOfPalindromes(123, 150));
		Assert.assertEquals(423, sumOfPalindronicNumbers.calculateSumOfPalindromes(123, 151));
		Assert.assertEquals(544, sumOfPalindronicNumbers.calculateSumOfPalindromes(121, 151));
	}
}
