package github;

import java.util.Stack;

public class SumOfPalindronicNumbers {

	public int calculateSumOfPalindromes(int startRange, int endRange) {

		int sumOfPalindromes = 0;
		for (int i = startRange; i <= endRange; i++) {

			String numToStr = String.valueOf(i);
			int mid = numToStr.length() / 2;
			boolean ignoreMidElement = (numToStr.length() % 2 != 0);
			boolean palindromTrue = false;
			Stack<Character> stack = new Stack<Character>();
			
			for (int j = 0; j < numToStr.length(); j++) {

				if (j >= mid) {
					if (ignoreMidElement) {
						ignoreMidElement = false;
						continue;
					} else {
						if (numToStr.charAt(j) == stack.pop()) {
							if (stack.isEmpty())
								palindromTrue = true;
							continue;
						} else
							break;
					}
				} else {
					stack.push(numToStr.charAt(j));
				}
			}
			if (palindromTrue) {
				System.out
						.println("SumOfPalindronicNumbers.main() startRange+i: "
								+ (i));
				sumOfPalindromes = sumOfPalindromes + (i);
			}
		}

		System.out.println("Sum of palindromes: " + sumOfPalindromes);
		return sumOfPalindromes;
	}
}
