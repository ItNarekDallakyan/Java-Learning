package concurrency.level2.Warehouse;

public class Product {
	
	public enum TypeProduct{
		FRUIT, VEGETABLE, MEATS;
	}
	
	private String name;
	private TypeProduct type;
	
	public Product(String name, TypeProduct type) {
		this.name=name;
		this.type=type;
	}

}
