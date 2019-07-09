import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class KattapaReadyForBattleTest.
 * 
 * @author kumar Kaushal
 */
public class KattapaReadyForBattleTest {

	/** KattapaReadyForBattle class instance. */
	KattapaReadyForBattle kattapaReadyForBattleInstance;

	/**
	 * KattapaReadyForBattle class instantiation
	 */
	@Before
	public void setUp() {
		kattapaReadyForBattleInstance = new KattapaReadyForBattle();

	}

	/**
	 * This method will execute after executing all the test cases. We are
	 * nullifying the initialized variable.
	 */
	@After
	public void tearDown() {
		kattapaReadyForBattleInstance = null;
	}

	/**
	 * Test case to check Katappa's Soldier ready for battle or not.
	 */
	@Test
	public void testCheckKattapaSoldierReadyForBattle() {
		Assert.assertEquals("NOT READY", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(4, new int[] { 11, 12, 13, 14 }));
		Assert.assertEquals("READY FOR BATTLE", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(3, new int[] { 2, 3, 4 }));
		Assert.assertEquals("NOT READY", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(4, new int[] { 7, 6, 4, 5 }));
		Assert.assertEquals("NOT READY", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(4, new int[] { 12, 13, 14, 15 }));
		Assert.assertEquals("READY FOR BATTLE", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(5, new int[] { 12, 13, 14, 15, 16 }));
		Assert.assertEquals("READY FOR BATTLE", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(7, new int[] { 17, 13, 14, 25, 26, 28, 30 }));
	}

	/**
	 * Test case to check Katappa's Soldier ready for battle or not with empty input.
	 */
	@Test
	public void testCheckKattapaSoldierReadyForBattleWithEpmtyInput() {
		Assert.assertEquals("Invalid input", kattapaReadyForBattleInstance.checkKattapaSoldierReadyForBattle(0, new int[] {}));
	}
}