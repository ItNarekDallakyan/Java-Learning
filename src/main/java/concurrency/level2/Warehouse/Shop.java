package concurrency.level2.Warehouse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import concurrency.level2.Warehouse.Product.TypeProduct;

public class Shop implements Runnable{
	//private static final int MAX_QUAN = 15;
	private static final int MIN_QUAN = 3;
	private static Warehouse warehouse;
	private HashMap<TypeProduct, Integer> products;
	private String name;
	
	public Shop(String name, Warehouse w) {
		Shop.warehouse=w;
		this.name=name;
		this.products=new HashMap<>();
		this.products.put(TypeProduct.FRUIT, 0);
		this.products.put(TypeProduct.VEGETABLE, 0);
		this.products.put(TypeProduct.MEATS, 0);
	}


	@Override
	public void run() {
		while(true){
			addToShop();
		}
	}
	
	public synchronized void addToShop(){
		for(Iterator<Entry<TypeProduct, Integer>> it=this.products.entrySet().iterator(); it.hasNext();){
			Entry<TypeProduct, Integer> e =it.next();
			int tmpCnt=e.getValue();
			if(tmpCnt<=MIN_QUAN){
				System.out.println(this.name + " has 5 more "+ e.getKey().toString());
				Shop.warehouse.sellProduct(e.getKey());
				this.products.put(e.getKey(), 5);
			}
		}
		//notify clients that can take products
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("thread was interrupted"+e.getMessage());
		}
	}
	
	
	public synchronized void sellToClient(TypeProduct type, int quantity){
		int tmpCnt=this.products.get(type);
		//if this product is deficient
		if(tmpCnt<quantity){
			//call shop run
			notifyAll();
			//and 
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("thread was interrupted"+e.getMessage());
			}
		}
		//else sell to client
		this.products.put(type, tmpCnt-quantity);
	}
	
	public String getName() {
		return name;
	}
	
}
