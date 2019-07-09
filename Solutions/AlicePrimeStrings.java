import java.util.Collection;
import java.util.HashMap;

/**
 * This class is responsible for checking whether the input string is primeString or not.
 * 
 * @author kumar Kaushal
 *
 */
public class AlicePrimeStrings {

	/**
	 * This method checks whether the input string is primeString or not.
	 * String is primeString if the distinct alphabets used in the string is a prime
	 * and also the number of occurrences of each alphabet in the string is also a prime.
	 * 
	 * @param inputString string that needs to be checked for PrimeString
	 * @return Yes if String is prime string else No 
	 */
	public String checkPrimeString(String inputString) {
		String isPrimeString = "No";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		if (inputString != null && !inputString.isEmpty()) {
			for (char c : inputString.toCharArray()) {
				charCountMap.put(c,charCountMap.containsKey(c) ? charCountMap.get(c) + 1 : 1);
			}

			if (isPrime(charCountMap.keySet().size())) {
				Collection<Integer> charOccurences = charCountMap.values();
				for (int count : charOccurences) {
					if (!isPrime(count)) {
						isPrimeString = "No";
						break;
					} else {
						isPrimeString = "Yes";
					}
				}
			}
			return isPrimeString;
		} else {
			return "Invalid Input";
		}
	}

	/**
	 * Checks whether number is prime or not
	 * 
	 * @param number to be checked for prime
	 * @return true if prime false otherwise
	 */
	private static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		int limit = (int) Math.sqrt(number);
		for (int i = 2; i <= limit; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
