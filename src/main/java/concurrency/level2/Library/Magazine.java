package concurrency.level2.Library;

public class Magazine extends ReadingObject {

	public enum Category implements IGroupType{
		LIFESTYLE, SCIENCE;
	}
	private static final int SLEEPING_TIME = 0;
	private static final double VALUE_OF_BOOK = 0;
	private Category category;
	private int number;
	
	public Magazine(String name, String publisher, Category cat, int num) {
		super(name, publisher, TypeReading.MAGAZINE, SLEEPING_TIME, VALUE_OF_BOOK);		
		this.category=cat;
		this.number=num;	
	}

	public int getNumber(){
		return this.number;
	}
	@Override
	public IGroupType getGroupType() {
		return this.category;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Number: "+this.number;
	}

	@Override
	public int compareTo(ReadingObject o) {
		Magazine m=(Magazine) o;
		if(this.getName().equals(m.getName())){
			return this.number-m.getNumber();
		}
		return this.getName().compareTo(m.getName());
	}

	
}
