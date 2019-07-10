package test;

import github.KatappaReadyForBattle;

import java.util.HashSet;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KatappaReadyForBattleTest {

	KatappaReadyForBattle katappaReadyForBattle; 
	@Before
	public void setUp() throws Exception {
		katappaReadyForBattle = new KatappaReadyForBattle();
	}

	@After
	public void tearDown() throws Exception {
		katappaReadyForBattle = null;
	}

	@Test
	public void katappaReadyForBattleTrueorFalse() {
		HashSet<Integer> inputSet = new HashSet<Integer>();
		inputSet.add(new Integer(2));
		inputSet.add(new Integer(5));
		inputSet.add(new Integer(7));
		inputSet.add(new Integer(8));
		inputSet.add(new Integer(9));
		inputSet.add(new Integer(11));
		inputSet.add(new Integer(13));
		inputSet.add(new Integer(17));
		inputSet.add(new Integer(19));
		
		Assert.assertFalse(katappaReadyForBattle.checkIsKatappaReadyForBattle(inputSet));
		inputSet.add(new Integer(120));
		inputSet.add(new Integer(122));
		inputSet.add(new Integer(124));
		inputSet.add(new Integer(126));
		inputSet.add(new Integer(128));

		
		Assert.assertFalse(katappaReadyForBattle.checkIsKatappaReadyForBattle(inputSet));
		inputSet.add(new Integer(130));
		Assert.assertTrue(katappaReadyForBattle.checkIsKatappaReadyForBattle(inputSet));
	}
	
	@Test
	public void katappaReadyForBattleTrueorFalseEmptySet(){
		HashSet<Integer> inputSet = new HashSet<Integer>();
		Assert.assertFalse(katappaReadyForBattle.checkIsKatappaReadyForBattle(inputSet));
	}

}
