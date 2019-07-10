package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;
import github.Shopping;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingTest {

	Shopping shopping ;
	@Before
	public void setUp() throws Exception {
		shopping = new Shopping();
	}

	@After
	public void tearDown() throws Exception {
		shopping = null;
	}

	@Test
	public void testRoyPayment() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(10);
		Assert.assertEquals(8, shopping.calculateRoyPaymentForShopping(input));
		input.clear();
		input.add(0);
		input.add(0);
		Assert.assertEquals(0, shopping.calculateRoyPaymentForShopping(input));
		input.add(5);
		input.add(7);
		input.add(11);
		input.add(13);
		Assert.assertEquals(0, shopping.calculateRoyPaymentForShopping(input));
		input.clear();
		Assert.assertEquals(0, shopping.calculateRoyPaymentForShopping(input));
	}
}
