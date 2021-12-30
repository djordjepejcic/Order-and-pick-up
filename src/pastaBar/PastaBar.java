package pastaBar;

public class PastaBar {

	public static void main(String[] args) {

		String[] ingredients = { "makarone", "spagete", "bolognese", "curetina", "govedja prsuta", "slanina",
				"piletina", "4 sira", "dimljeni sir", "parmezan", "pavlaka", "pesto sos", "napolitana", "povrce mix",
				"pecurke", "kutija" };

		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

	}

	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equalsIgnoreCase(ingredientName)) {
				return i;
			}
		}
		return 0;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		return false;
	}

}
