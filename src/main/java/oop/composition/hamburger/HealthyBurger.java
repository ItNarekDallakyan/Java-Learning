package oop.composition.hamburger;

public class HealthyBurger extends Hamburger {

	private String breadType;
	private Toppings toppings;
	private boolean chickpeas;
	private boolean avocado;
	private double toppingsPrice;
	private double healthyTotal;

	
	public HealthyBurger(String meat, Toppings toppings, boolean chickpeas, boolean avocado) {
		
		super("brown rye", meat, 4.50, toppings);
		this.chickpeas = chickpeas;
		this.avocado = avocado;

	}

	
	public boolean isChickpeas() {
		return chickpeas;
	}

	public boolean isAvocado() {
		return avocado;
	}

	
	public double chickpeaPrice() {

		if (chickpeas) {
			return .75;
		} else {
			return 0;
		}

	}

	public double avocadoPrice() {

		if (avocado) {
			return .50;
		} else {
			return 0;
		}

	}

	public double toppingsPrice() {

		this.toppingsPrice = chickpeaPrice() + avocadoPrice();
		return toppingsPrice;

	}

	@Override
	public double totalCost() {

		this.healthyTotal = super.totalCost() + toppingsPrice();
		return healthyTotal;

	}

	@Override
	public void listOfToppings() {

		if (isChickpeas()) {
			System.out.printf("\nchickpeas  ($%.2f)", chickpeaPrice());
		}
		if (isAvocado()) {
			System.out.printf("\navocados   ($%.2f)", avocadoPrice());
		}

	}

	@Override
	public void burgerDescription() {

		System.out.println("2. You ordered a Healthy Burger. A " + getMeat() + " burger on " + getBreadType() + " bread.");
		System.out.printf("The base price for your burger is $%.2f", basePrice());
		super.listOfToppings();
		listOfToppings();

	}

	@Override
	public void burgerCost() {

		System.out.println();
		System.out.printf("\nThe total price of your burger is $%.2f\n\n\n", totalCost());

	}

}
