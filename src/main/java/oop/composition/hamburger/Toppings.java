package oop.composition.hamburger;

public class Toppings {

	private boolean lettuce;
	private boolean tomatoes;
	private boolean onions;
	private boolean cheese;
	private double toppingsPrice = 0.00;

	public Toppings(boolean lettuce, boolean tomatoes, boolean onions, boolean cheese) {
		this.lettuce = lettuce;
		this.tomatoes = tomatoes;
		this.onions = onions;
		this.cheese = cheese;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isTomatoes() {
		return tomatoes;
	}

	public boolean isOnions() {
		return onions;
	}

	public boolean isCheese() {
		return cheese;
	}

	public double lettucePrice() {
		
		if(lettuce) {
			return .50;
		} else {
			return 0;
		}

	}

	public double tomatoPrice() {
		
		if(tomatoes) {
			return .75;
		} else {
			return 0;
		}

	}

	public double onionPrice() {
		
		if(onions) {
			return .80;
		} else {
			return 0;
		}

	}

	public double cheesePrice() {
		
		if(cheese) {
			return 1.00;
		} else {
			return 0;
		}

	}

	public double toppingsPrice() {
		
		this.toppingsPrice = lettucePrice() + tomatoPrice() + onionPrice() + cheesePrice();
		return toppingsPrice;
		
	}

}
