package test;

import github.LuckyDay;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LuckyDayTest {

	LuckyDay luckyDay ;
	@Before
	public void setUp() throws Exception {
		luckyDay = new LuckyDay();
	}

	@After
	public void tearDown() throws Exception {
		luckyDay = null;
	}

	@Test
	public void luckyDaytestPositive() {
		Assert.assertSame("YES",luckyDay.checkLuckyDay("ABABABC"));
		Assert.assertNotSame("YES",luckyDay.checkLuckyDay("ABCBABC"));
		Assert.assertSame("YES",luckyDay.checkLuckyDay("ABCXYZABAB"));
		Assert.assertSame("YES",luckyDay.checkLuckyDay("123123"));
	}
	
	@Test
	public void luckyDayTestNegative() {
		Assert.assertNotSame("YES",luckyDay.checkLuckyDay(""));
		Assert.assertNotSame("YES",luckyDay.checkLuckyDay(null));
	}

}
