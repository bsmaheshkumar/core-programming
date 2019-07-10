package github;

import java.util.HashMap;
import java.util.Set;

public class BrianCarName {

	private static int maxNoOfDistinctCharactersAllowed = 3;

	public String BrianCarNameFormat(String inputString) {
		if (inputString != null && !inputString.isEmpty()
				&& !inputString.trim().isEmpty()) {
			HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

			for (int loop = 0; loop < inputString.length(); loop++) {
				char c = inputString.charAt(loop);
				boolean charChanged = false;
				if (loop > 0) {
					if (c != inputString.charAt(loop - 1)) {
						charChanged = true;
						if (hs.containsKey(c)) {
							System.out.println("Not OK");
							return "Not OK";
						}
					}
				}
				if (hs.containsKey(c)) {
					int val = hs.get(c);
					hs.put(c, val + 1);
				} else {
					hs.put(c, 1);
				}

				if (hs.size() > maxNoOfDistinctCharactersAllowed) {
					System.out.println("Not OK");
					return "Not OK";
				}
			}

			if (hs.size() != maxNoOfDistinctCharactersAllowed) {
				System.out.println("Not OK");
				return "Not OK";
			}
			Set<Character> charset = hs.keySet();
			int count = 0;
			for (Character ch : charset) {
				if (count == 0) {
					count = hs.get(ch);
				} else {
					if (count != hs.get(ch)) {
						System.out.println("Not OK");
						return "Not OK";
					}
				}
			}

			System.out.println("OK");
			return "OK";
		} else {
			System.out
					.println("Empty String!! Can't check if it is a PrimeString.");
			return "Not Ok";
		}
	}
}
