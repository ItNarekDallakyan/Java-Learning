package concurrency.level2.Library;
public class Book extends ReadingObject {

	enum Genre implements IGroupType{
		SCIFI, DRAMA, ACTION;
	}	
	private static final int SLEEPING_TIME = 3000;
	private static final double VALUE_OF_BOOK = 2.0;
	private String author;
	private String date;
	private Genre genre;
	
	public Book(String name, String publisher, String author, Genre genre, String date) {
		super(name, publisher, TypeReading.BOOK, SLEEPING_TIME, VALUE_OF_BOOK);
		this.author=author;
		this.genre=genre;
		this.date=date;
	}

	@Override
	public IGroupType getGroupType() {
		return this.genre;
	}


	@Override
	public String toString() {
		return super.toString()+ ", Author: "+this.author;
		
	}

	@Override
	public int compareTo(ReadingObject o) {
		Book b=(Book)o;
		return this.date.compareTo(b.getDate());
	}

	private String getDate() {
		return this.date;
	}

	
}