package github;

import java.util.HashSet;
import java.util.Set;

public class LuckyDay {

	public String checkLuckyDay(String inputString) {

		if (inputString == null && inputString.isEmpty()
				&& inputString.trim().isEmpty()) {
			System.out.println("No");
			return "NO";
		} else {
			char[] charArray = inputString.toCharArray();
			boolean proceedFurther = false;
			boolean found = false;
			for (int i = 0; i < charArray.length; i++) {

				Set<Character> s1 = new HashSet<Character>();
				for (int j = i; j < charArray.length; j++) {
					if (s1.isEmpty()) {
						s1.add(charArray[j]);
					} else {
						if (!s1.contains(charArray[j])) {
							s1.add(charArray[j]);
						} else {
							if (j < charArray.length - 1
									&& charArray[i] == charArray[j]
									&& j + s1.size() <= charArray.length) {
								proceedFurther = true;
							}
							break;
						}
					}
				}
				if (proceedFurther) {

					String subString = inputString.substring(i, i + s1.size());
					String subString2 = inputString.substring(i + s1.size(), i
							+ s1.size() * 2);
					if (subString.equals(subString2)) {
						found = true;
					}
					proceedFurther = false;
				}

			}

			if (found) {
				System.out.println("YES");
				return "YES";
			} else {
				System.out.println("NO");
				return "NO";
			}

		}
	}
}
