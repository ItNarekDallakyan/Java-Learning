package concurrency.level2.Library;

public abstract class ReadingObject implements Comparable<ReadingObject> {

	public enum TypeReading{
		BOOK, MAGAZINE, TEXTBOOK;
	}
	
	private String name;
	private String publisher;
	private TypeReading type;
	private int sleepingTime;
	private double valueRent;
	public BookChecker checker;
	
	
	public ReadingObject(String name, String publisher, TypeReading type, int sleepingTime, double value) {
		this.name = name;
		this.publisher = publisher;
		this.type = type;
		this.sleepingTime=sleepingTime;
		this.valueRent=value;
	}	
	
	String getName() {
		return name;
	}

	String getPublisher() {
		return publisher;
	}

	public TypeReading getType(){
		return this.type;
	}
	

	
	public abstract IGroupType getGroupType();

	@Override
	public String toString() {
		return "name=" + name + ", publisher=" + publisher ;
	}

	public int getSleepingTime() {
		return this.sleepingTime;
	}
	public double getValueRent() {
		return this.valueRent;
	}

	

	
	
}

