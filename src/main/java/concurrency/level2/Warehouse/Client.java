package concurrency.level2.Warehouse;

import java.util.Random;

import concurrency.level2.Warehouse.Product.TypeProduct;

public class Client  extends Thread {

	private Shop shop;
	private String name;
	
	public Client(String name,Shop s) {
		this.shop=s;
		this.name=name;
	}
	
	@Override
	public void run() {
		while(true){
			TypeProduct randType=TypeProduct.values()[new Random().nextInt(TypeProduct.values().length)];
			int randAmount=new Random().nextInt(4)+1;
			this.shop.sellToClient(randType, randAmount);
			System.out.println(this.name + " buy "+ randAmount + " "+ randType.toString()+ "from "+this.shop.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("thread was interrupted"+e.getMessage());
			}
		}
	}
}
