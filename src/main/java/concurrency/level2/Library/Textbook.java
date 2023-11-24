package concurrency.level2.Library;

public class Textbook extends ReadingObject {
	public enum Theme implements IGroupType{
		HISTORY, BIOLOGY;
	}
	private static final int SLEEPING_TIME = 1500;
	private static final double VALUE_OF_BOOK = 2.0;
	
	private String author;
	private Theme theme;
	
	public Textbook(String name, String publisher, String author, Theme t) {
		super(name, publisher, TypeReading.TEXTBOOK, SLEEPING_TIME, VALUE_OF_BOOK);
		this.author=author;
		this.theme=t;
	}

	@Override
	public IGroupType getGroupType() {
		return this.theme;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Author: "+this.author;
	}

	@Override
	public int compareTo(ReadingObject o) {
		Textbook t=(Textbook)o;
		return this.getName().compareTo(t.getName());
	}
	
}
