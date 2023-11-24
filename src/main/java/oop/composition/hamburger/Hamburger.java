package oop.composition.hamburger;

public class Hamburger {

	private String breadType;
	private String meat;
	private double basePrice;
	private Toppings toppings;
	private double totalCost;

	public Hamburger(String breadType, String meat, double basePrice) {
		this.breadType = breadType;
		this.meat = meat;
		this.basePrice = basePrice;
	}

	public Hamburger(String breadType, String meat, double basePrice, Toppings toppings) {
		this(breadType, meat, basePrice);
		this.toppings = toppings;
	}

	public String getBreadType() {
		return breadType;
	}

	public String getMeat() {
		return meat;
	}

	public double basePrice() {
		return basePrice;
	}

	public Toppings getToppings() {
		return toppings;
	}

	public double totalCost() {

		this.totalCost = basePrice + toppings.toppingsPrice();
		return this.totalCost;

	}

	public void listOfToppings() {

		System.out.println("\n\nYour burger has:");

		if (toppings.isLettuce()) {
			System.out.printf("lettuce    ($%.2f)", toppings.lettucePrice());
		}
		if (toppings.isTomatoes()) {
			System.out.printf("\ntomatoes   ($%.2f)", toppings.tomatoPrice());
		}
		if (toppings.isOnions()) {
			System.out.printf("\nonions     ($%.2f)", toppings.onionPrice());
		}
		if (toppings.isCheese()) {
			System.out.printf("\ncheese     ($%.2f)", toppings.cheesePrice());
		}

	}

	public void burgerDescription() {

		System.out.println("1. You ordered a mouthwatering " + getMeat() + " burger on a " + getBreadType() + " bun.");
		System.out.printf("The base price for your burger is $%.2f", basePrice());
		listOfToppings();

	}

	public void burgerCost() {

		System.out.println();
		System.out.printf("\nThe total price of your burger is $%.2f\n\n\n", totalCost());

	}

}
