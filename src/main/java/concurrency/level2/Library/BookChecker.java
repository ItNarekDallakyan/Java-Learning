package concurrency.level2.Library;

public class BookChecker extends Thread {

	private ReadingObject reading;
	private Library library;
	
	public BookChecker(ReadingObject reading, Library library) {
		this.reading = reading;
		this.library = library;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(this.reading.getSleepingTime());
			while(true){
				this.library.increaseTax(this.reading);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			//stop count tax when reader return book in library
			return;
		}
	}
	
	
}
