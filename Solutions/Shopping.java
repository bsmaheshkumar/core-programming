/**
 * Shopping class
 * 
 * This class is responsible for finding total amount spent by Roy for Alfi's
 * shopping.
 * 
 * @author kumar Kaushal
 * 
 */
public class Shopping {

	/**
	 * This method takes the array of MRPs for each product and finds the total
	 * amount spent by Roy for shopping. Condition is that Alfi has to pay
	 * minimum prime factor for each product and Roy will pay the remaining
	 * amount of each product.
	 * 
	 * @param mrpOfProducts array of MRPs of each product
	 * @return total amount spent by Roy for Alfi's Shopping
	 */
	public int findTotalAmountspentByRoy(int[] mrpOfProducts) {
		int totalAmountSpentByRoy = 0;

		if (mrpOfProducts != null && mrpOfProducts.length != 0) {
			for (int i = 0; i < mrpOfProducts.length; i++) {
				int minPrimeFactor = findMinimumPrimeFactor(mrpOfProducts[i]);
				if (minPrimeFactor != -1) {
					totalAmountSpentByRoy += mrpOfProducts[i] - minPrimeFactor;
				} else {
					// No prime factor for the number
					totalAmountSpentByRoy += mrpOfProducts[i];
				}
			}
		}
		return totalAmountSpentByRoy;
	}

	/**
	 * Finds the minimum prime factor of any number.
	 * 
	 * @param number for which minimum prime factor has to be found.
	 * @return returns the minimum prime factor
	 */
	private int findMinimumPrimeFactor(int number) {
		int minPrimeFactor = -1;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				minPrimeFactor = i;
				return minPrimeFactor;
			}
		}
		if (number > 1) {
			minPrimeFactor = number;
		}
		return minPrimeFactor;
	}
	
	/*public static void main(String[] args) {
		Shopping obj = new Shopping();
		System.out.println(obj.findMinimumPrimeFactor(7));
	}*/

}
