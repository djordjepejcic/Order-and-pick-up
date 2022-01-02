package pastaBar;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] ingredients = { "makarone", "spagete", "bolognese", "curetina", "govedja prsuta", "slanina",
				"piletina", "4 sira", "dimljeni sir", "parmezan", "pavlaka", "pesto sos", "napolitana", "povrce mix",
				"pecurke", "kutija" };

		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		boolean stopOrdering = false;
		double sumPrices = 0;

		System.out.println("Izvolite!! :-)");

		while (!stopOrdering) {

			System.out.print("Izaberite sastojak za pastu: ");
			String ingredientName = s.nextLine();

			int ingredientIndex = findIngredient(ingredients, ingredientName);

			if (ingredientName.equalsIgnoreCase("Poruci")) {

				stopOrdering = true;

				System.out.print("Unesite broj telefona: ");
				String phone = s.next();

				if (isRegularCustomer(phoneNumbers, phone)) {
					sumPrices = sumPrices * 0.9;
				}

			} else if (ingredientIndex > -1) {

				sumPrices = sumPrices + prices[ingredientIndex];

			} else {
				System.out.println("Pogresan unos. Molimo Vas, unesite ispravan naziv sastojaka. :-)");
			}

		}

		String currency = " dinara.";

		if (sumPrices % 10 == 1) {
			currency = " dinar.";
		}

		System.out.println("Cena vase paste iznosi: " + sumPrices + currency);
		System.out.println("Prijatno!! :-)");
	}

	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equalsIgnoreCase(ingredientName)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {
		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phoneNumbers[i].equals(phone)) {
				return true;
			}
		}
		return false;
	}
}