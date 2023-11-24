package concurrency.level2.Library;

public class Reader {

	private String name;
	private Library library;
	private ReadingObject takenReading;
	
	public Reader(String name, Library library) {
		this.name = name;
		this.library = library;
	}
	
	public void takeBook(ReadingObject reading){
		this.takenReading=library.giveBook(reading);
		if(this.takenReading==null){
			return;
		}
		System.out.println(this.name+" take "+this.takenReading.getName());
	}
	
	public void returnBook(){
		if(this.takenReading==null){
			return;
		}
		this.library.receiveBook(this.takenReading);
		System.out.println(this.name + " return "+this.takenReading.getName());
		this.takenReading=null;
	}
	

	
}
