package github;

import java.util.Stack;

public class NonReducible {

	int numOfOps = 0;
	public String NonReducibleString(String inputString) {

		if (inputString != null && !inputString.isEmpty()
				&& !inputString.trim().isEmpty()) {
			Stack<Character> stack = new Stack<Character>();
			
			for (Character ch : inputString.toCharArray()) {
				if (stack.isEmpty()) {
					stack.push(ch);
				} else {
					if ((stack.peek() == ch)) {
						stack.pop();
						numOfOps++;
					} else {
						stack.push(ch);
					}
				}
			}
			String str = stack.toString();

			System.out.print("object with reduced string: ");
			String nonReducibleString = "";
			for (char ch : str.toCharArray()) {
				if (ch >= 97 && ch <= 122) {
					System.out.print(ch);
					nonReducibleString = nonReducibleString + ch;
				}
			}
			System.out.println("\nnum of operations: " + numOfOps);
			return nonReducibleString.trim();
		} else {
			System.out.println("Empty String.");
			return null;
		}
	}
}
