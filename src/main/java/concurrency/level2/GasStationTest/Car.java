package concurrency.level2.GasStationTest;

public class Car {
	
	public enum TypeFuel{
		DIESEL, GAS, PETROL;
	}
	
	private TypeFuel fuel;
	private int amount;
	private int numColumn;
	
	public TypeFuel getFuel() {
		return fuel;
	}
	public void setFuel(TypeFuel fuel) {
		this.fuel = fuel;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getNumColumn() {
		return numColumn;
	}
	public void setNumColumn(int numColumn) {
		this.numColumn = numColumn;
	}	

}
