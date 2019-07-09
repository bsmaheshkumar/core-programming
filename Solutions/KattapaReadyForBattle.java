/**
 * This class is designed to check whether Katappa's soldier is ready for battle or not.
 * Since Kattapa is superstitious Kattapa's soldier readiness depends on number of weapons
 * they are carrying. Soldier is "lucky" if the soldier is holding an even number of weapons, 
 * and "unlucky" otherwise. 
 * 
 * @author kumar Kaushal
 *
 */
public class KattapaReadyForBattle {

	/**
	 * This method checks whether kattapa's soldier is holding an even number of weapons or odd number of weapons.
	 * Kattapa is ready for battle only when number of soldier carrying even number of weapons is
	 * greater than soldiers carrying odd number of weapons.
	 * 
	 * @param arr contains number of weapons kattapa's soldier is having
	 * @return whether kattapa is ready for battle or not
	 */
	public String checkKattapaSoldierReadyForBattle(int numbeofSoldiers, int[] weapons) {
		int evenCount = 0, oddCount = 0;
		
		if (numbeofSoldiers == 0 || weapons.length == 0 || numbeofSoldiers != weapons.length)
			return "Invalid input";
		
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		if (evenCount > oddCount)
			return "READY FOR BATTLE";
		else
			return "NOT READY";
	}
}