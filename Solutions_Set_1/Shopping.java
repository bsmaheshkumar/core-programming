package github;

import java.util.ArrayList;

public class Shopping {

	public int calculateRoyPaymentForShopping(ArrayList<Integer> priceList) {
		System.out.println(priceList);
		int totalOfMRPs = 0;
		int totalOfMinPrimeFactors = 0;
		for (Integer itemPrice : priceList) {
			totalOfMRPs += itemPrice;
			for (int i = 2; i <= itemPrice; i++) {
				if (itemPrice % i == 0) {
					totalOfMinPrimeFactors += i;
					break;
				}
			}
		}

		System.out.println("totalOfMRPs: " + totalOfMRPs);
		System.out.println("Alfi will pay: " + totalOfMinPrimeFactors);
		System.out.println("Roy will pay: "
				+ (totalOfMRPs - totalOfMinPrimeFactors));
		return (totalOfMRPs - totalOfMinPrimeFactors);
	}
}
