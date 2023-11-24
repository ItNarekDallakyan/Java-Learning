package concurrency.level2.Warehouse;

public class Supplier extends Thread {

	private Warehouse warehouse;
	
	public Supplier(Warehouse w) {
		this.warehouse=w;
	}
	
	@Override
	public void run() {
		while (true) {
			this.warehouse.supplyProduct();
		}
	}
}
