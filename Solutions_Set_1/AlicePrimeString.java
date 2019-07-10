package github;

import java.util.HashMap;
import java.util.Set;

public class AlicePrimeString {

	public String CheckAlicePrimeString(String inputString) {

		if (inputString != null && !inputString.isEmpty()
				&& !inputString.trim().isEmpty()) {

			HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

			for (int i = 0; i < inputString.length(); i++) {
				char c = inputString.charAt(i);
				if (hs.containsKey(c)) {
					int val = hs.get(c);
					hs.put(c, val + 1);
				} else {
					hs.put(c, 1);
				}
			}

			Set<Character> valueSet = (Set<Character>) hs.keySet();
			int charSetSize = valueSet.size();

			if (checkForPrimeNumber(charSetSize)) {
				boolean flag = true;
				// Go ahead with char by char 'check for prime' of the input
				// string
				for (Character ch : valueSet) {
					if (!checkForPrimeNumber((hs.get(ch)).intValue())) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println("PrimeString?: Yes");
					return "Yes";
				} else {
					System.out
							.println("Number of times Character repeated is not a prime number!!");
					System.out.println("PrimeString?: No");
					return "No";
				}
			} else {
				System.out
						.println("Number of Distinct Characters in the string is Non Prime!!");
				System.out.println("PrimeString?: No");
				return "No";
			}
		} else {
			System.out
					.println("Error. Empty String!! Can't check if it is a PrimeString.");
			return "Error";
		}

	}

	private static boolean checkForPrimeNumber(int number) {

		int mid = number / 2;
		boolean flag = true;

		if (number == 0 || number == 1) {
			flag = false;
		} else {
			for (int i = 2; i <= mid; i++) {
				if (number % i == 0) {
					flag = false;
				}
			}
		}
		return flag;
	}
}
