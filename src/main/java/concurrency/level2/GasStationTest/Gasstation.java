package concurrency.level2.GasStationTest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;



public class Gasstation {
	
	private static class Reporter extends Thread{
		@Override
		public void run() {
			// TODO db things
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("reporter was interrupted");
			}
		}
	}
	
	private Cashier cashWorker1=new Cashier();
	private Cashier cashWorker2=new Cashier();
	private FuelBoy fuelWorker1=new FuelBoy();
	private FuelBoy fuelWorker2=new FuelBoy();
	
	//queue because when the queue is empty, fuelboy doesn't has to wait
	private ArrayList<Queue<Car>> columns;
	//blockingqueue because when the queue is empty, cashier has to wait
	private ArrayList<ArrayBlockingQueue<Car>> cashDesks;
	//numCol->typeFuel->date,time
	private HashMap<Integer, HashMap<Car.TypeFuel, ConcurrentHashMap<LocalDateTime, Integer>>> statistics;
	
	
	public Gasstation() {
		this.columns=new ArrayList<>();
		this.cashDesks=new ArrayList<>();
		this.statistics=new HashMap<>();
		for(int i=0; i<5; i++){
			this.columns.add(new LinkedList<>());
			this.statistics.put(i+1, new HashMap<>());
			this.statistics.get(i+1).put(Car.TypeFuel.GAS, new ConcurrentHashMap<>());
			this.statistics.get(i+1).put(Car.TypeFuel.PETROL, new ConcurrentHashMap<>());
			this.statistics.get(i+1).put(Car.TypeFuel.DIESEL, new ConcurrentHashMap<>());
		}
		
		for(int i=0; i<2; i++){
			this.cashDesks.add(new ArrayBlockingQueue<Car>(5));			
		}
		
		FuelBoy.station=this;
		Cashier.station=this;
		
		this.cashWorker1.setCash(this.cashDesks.get(0));
		this.cashWorker2.setCash(this.cashDesks.get(1));
		
		this.fuelWorker1.start();
		this.fuelWorker2.start();
		this.cashWorker1.start();
		this.cashWorker2.start();
		
		Reporter rep=new Reporter();
		rep.setDaemon(true);
		rep.start();		
	}

	public void enterInGasstation(Car car){
		int rand=new Random().nextInt(this.columns.size());
		this.columns.get(rand).offer(car);
		System.out.println("Car enter in gasstation at colomn "+ (rand+1));
	}
	
	public List<Queue<Car>> getColumns() {
		return Collections.unmodifiableList(this.columns);
	}

	public void requireToPay(Car car) {
		int rand=new Random().nextInt(this.cashDesks.size());
		try {
			this.cashDesks.get(rand).put(car);
		} catch (InterruptedException e) {
			System.out.println("Add to cashDesk was interrupted.");
		}		
	}

	public void addData(Car.TypeFuel fuel, int amount, int numCol, LocalDateTime date) {
		this.statistics.get(numCol).get(fuel).put(date, amount);
		DBManager.getInstance().insertIntoDB(fuel, amount, numCol, date);
	}
	
	public void printStatistics(){
		for(Integer i : this.statistics.keySet()){
			System.out.println("Column "+ i);
			
			for(Car.TypeFuel t: this.statistics.get(i).keySet()){
				System.out.println("  "+t.toString()+": ");
				
				for(Entry<LocalDateTime, Integer> e: this.statistics.get(i).get(t).entrySet()){
					System.out.println("    "+e.getValue()+" liters on "+ e.getKey());
				}
			}
		}
		
	}
	
	

}
