package concurrency.level2.GasStationTest;

public class Demo {
	
	public static void main(String[] args) {
		Gasstation omv=new Gasstation();
		for(int i=0; i<20; i++){
			omv.enterInGasstation(new Car());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("enter in station was interrupted");
			}
		}	
		
		omv.printStatistics();
	}
}
