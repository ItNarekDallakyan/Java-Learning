package oop.composition.hamburger;

public class DeluxeBurger extends Hamburger{

	private boolean fries;
	private boolean drink;
	private double sidesTotal;
	private double deluxeTotal;
	
	
	public DeluxeBurger(String breadType, String meat, boolean fries, boolean drink) {
		super(breadType, meat, 4.00);
		this.fries = fries;
		this.drink = drink;		
	}

	
	public boolean isFries() {
		return fries;
	}

	public boolean isDrink() {
		return drink;
	}
	
	
	public double friesPrice() {

		if (this.fries) {
			return 1.00;
		} else {
			return 0;
		}

	}
	
	public double drinkPrice() {

		if (this.drink) {
			return 1.50;
		} else {
			return 0;
		}

	}
	
	public double sidesPrice() {

		this.sidesTotal = friesPrice() + drinkPrice();
		return sidesTotal;

	}
	
	@Override
	public double totalCost() {
		
		deluxeTotal = basePrice() + sidesPrice();
		return deluxeTotal;
		
	}
	
	public void listOfSides() {
		
		if (isFries()) {
			System.out.printf("\nfries       ($%.2f)", friesPrice());
		}
		if (isDrink()) {
			System.out.printf("\nsoftdrink   ($%.2f)", drinkPrice());
		}
	}

	@Override
	public void burgerDescription() {
		
		System.out.println("3. You ordered a Deluxe Burger. A " + getMeat() + " burger on " + getBreadType() + " bun.");
		System.out.printf("The base price for your burger is $%.2f\n\n", basePrice());
		System.out.println("Your burger has:");
		listOfSides();
		
	}


	@Override
	public void burgerCost() {
		
		System.out.println();
		System.out.printf("\nThe total price of your burger is $%.2f\n\n\n", totalCost());
		
	}
	
	
	
	
	
}

