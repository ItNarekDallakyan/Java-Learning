package concurrency.level2.Warehouse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import concurrency.level2.Warehouse.Product.TypeProduct;


public class Warehouse {
	private static final int MIN_VALUE=10;
	
	//type->quantity
	private HashMap<TypeProduct, Integer> stock;
	
	public Warehouse() {
		this.stock=new HashMap<>();
		this.stock.put(TypeProduct.FRUIT, 15);
		this.stock.put(TypeProduct.VEGETABLE, 15);
		this.stock.put(TypeProduct.MEATS, 15);		
	}

	
	public synchronized void supplyProduct(){
		//for each product
		for(Iterator<Entry<TypeProduct, Integer>> it = stock.entrySet().iterator(); it.hasNext();){
			Entry<TypeProduct, Integer> e = it.next();
			int tmpCount= e.getValue();
			//check if it is necessary
			if(tmpCount<=MIN_VALUE){
				tmpCount+=25;
				System.out.println("supply "+tmpCount+" "+e.getKey().toString());
				//supply
				this.stock.put(e.getKey(), tmpCount);
			}			
		}
		//notify stores that can take products
		notifyAll();
		//wait next call
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("thread was interrupted"+e.getMessage());
		}
	}
	
	public synchronized void sellProduct(TypeProduct t){		
		int tmpCount=this.stock.get(t);
		//if this product is deficient
		if(tmpCount<=MIN_VALUE){
			//call supplier
			notifyAll();
			//wait supplier to do his job
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("thread was interrupted"+e.getMessage());
			}
		}
		//else sell 5 
		this.stock.put(t, tmpCount-5);
		System.out.println("warehouse sell 5 "+ t.toString());
	}
}
