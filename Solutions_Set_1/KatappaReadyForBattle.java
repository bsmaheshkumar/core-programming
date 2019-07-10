package github;

import java.util.HashSet;
import java.util.Set;

public class KatappaReadyForBattle {

	public boolean checkIsKatappaReadyForBattle(HashSet<Integer> inputSet) {

		if (inputSet != null && !inputSet.isEmpty()) {
			Set<Integer> resultSet = new HashSet<Integer>();
			Object[] weaponsArr = (Object[]) inputSet.toArray();
			for (int i = 0; i < weaponsArr.length; i++) {
				int weapons = ((Integer)weaponsArr[i]).intValue();
				if (weapons % 2 == 0) {
					resultSet.add(i);
				}
				if (resultSet.size() > inputSet.size() / 2) {
					System.out.println("\"READY FOR BATTLE\"");
					return true;
				}
			}
			if (resultSet.size() > inputSet.size() / 2) {
				System.out.println("\"READY FOR BATTLE\"");
				return true;
			} else {
				if (resultSet.size() < inputSet.size() / 2) {
					System.out.println("\"NOT READY\"");
					return false;
				}
			}

		} 
		System.out.println("\"NOT READY\"");
		return false;
	}
}
