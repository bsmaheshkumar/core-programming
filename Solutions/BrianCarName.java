import java.util.HashMap;

/**
 * This class is responsible to check whether Brian Car name is OK or not.
 * Car name is OK only if it satisfies few conditions.
 * 
 * @author kumar Kaushal
 * 
 */
public class BrianCarName {

	/**
	 * This method checks whether Brian's car name is OK or not. It returns OK
	 * only if satisfies the following conditions Name must Consist exactly
	 * three distinct characters All distinct characters must occur same number
	 * of times i.e. if C1 occurred 2 times, C2 and C3 must also occur 2 times.
	 * 
	 * @param str
	 * @return true or false
	 */
	public String checkBrianCarName(String inputString) {
		String carNameStatus = "OK";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		if (inputString != null && !inputString.isEmpty()) {
			for (char c : inputString.toCharArray()) {
				charCountMap.put(c, charCountMap.containsKey(c) ? charCountMap.get(c) + 1 : 1);
			}

			if (charCountMap.keySet().size() == 3) {
				int firstOccr = -1;
				for (Integer i : charCountMap.values()) {
					if (firstOccr == -1) {
						firstOccr = i;
					} else if (firstOccr != i) {
						carNameStatus = "Not OK";
						break;
					}
				}
			} else {
				carNameStatus = "Not OK";
			}
			return carNameStatus;
		} else {
			return "Invalid Input";
		}
	}
}