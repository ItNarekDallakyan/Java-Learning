package concurrency.level2.Warehouse;

public class Demo {
	public static void main(String[] args) {
		Warehouse warehouse =new Warehouse();
		
		Shop billa=new Shop("Billa", warehouse);
		Shop fantastico=new Shop("Fantastico", warehouse);
		Shop kaufland = new Shop("Kaufland", warehouse);
		
		Client pesho=new Client("Pesho", fantastico);
		Client gosho=new Client("Gosho", fantastico);
		Client misho=new Client("Misho", kaufland);
		Client penka=new Client("Penka", kaufland);
		Client goshka=new Client("Goshka", billa);
		Client mishka=new Client("Mishka", billa);
		
		Thread t1=new Thread(billa);
		Thread t2=new Thread(kaufland);
		Thread t3=new Thread(fantastico);
		
		pesho.start();
		gosho.start();
		mishka.start();
		misho.start();
		penka.start();
		goshka.start();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
