package oop.composition.hamburger;

public class HamburgerTest {

	public static void main(String[] args) {

		Toppings toppings1 = new Toppings(true, true, true, true);
		Hamburger hamburger1 = new Hamburger("white", "medium", 3.50, toppings1);
		
		Toppings toppings2 = new Toppings(true, true, true, true);
		HealthyBurger hamburger2 = new HealthyBurger("well done", toppings2, true, true);
		
		DeluxeBurger hamburger3 = new DeluxeBurger("a sesame seed", "medium-well", false, true);
		
		
		hamburger1.burgerDescription();
		hamburger1.burgerCost();
		
		hamburger2.burgerDescription();
		hamburger2.burgerCost();
		
		hamburger3.burgerDescription();
		hamburger3.burgerCost();
		
	}

}
