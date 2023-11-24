package concurrency.level2.GasStationTest;

import java.time.LocalDateTime;
import java.util.concurrent.ArrayBlockingQueue;

public class Cashier extends Thread {
	public static Gasstation station;
	private ArrayBlockingQueue<Car> cash;
	
	@Override
	public void run() {
		while(true){
			try {
				Car car=this.cash.take();
				sleep(2000);
				station.addData(car.getFuel(), car.getAmount(), car.getNumColumn(), LocalDateTime.now());
				System.out.println("Owner pay for "+ car.getAmount()+" liters "+ car.getFuel().toString());
			} catch (InterruptedException e) {
				System.out.println("Paying was interrupted.");
			}
		}
	}
	
	public void setCash(ArrayBlockingQueue<Car> cash) {
		this.cash = cash;
	}

}
