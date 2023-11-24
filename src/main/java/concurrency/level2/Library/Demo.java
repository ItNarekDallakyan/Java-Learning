package concurrency.level2.Library;

import concurrency.level2.Library.Book.Genre;
import concurrency.level2.Library.Magazine.Category;
import concurrency.level2.Library.Textbook.Theme;

public class Demo {

	public static void main(String[] args) {
		
		Library lib=new Library("Libsu");
		
		Book book1=new Book("Pod igoto", "Orange", "Ivan Vazov", Genre.DRAMA, "14.10.2000");
		Book book2=new Book("Sladkar", "Orange", "Gana", Genre.ACTION, "18.10.2000");
		Book book3=new Book("Rama2", "Orange", "Klark", Genre.SCIFI, "29.10.2000");
		
		Magazine m1=new Magazine("Hicomm", "Orange", Category.SCIENCE, 1);
		Magazine m2=new Magazine("Hello", "Orange", Category.LIFESTYLE, 4);
		
		Textbook t1=new Textbook("Biologia", "Orange", "Grigor", Theme.BIOLOGY);
		Textbook t2=new Textbook("History", "Orange", "Silvestur", Theme.HISTORY);
		
		lib.addReadingObject(book1);
		lib.addReadingObject(book2);
		lib.addReadingObject(book3);
		lib.addReadingObject(m1);
		lib.addReadingObject(m2);
		lib.addReadingObject(t1);
		lib.addReadingObject(t2);
		
		//lib.printCatalog();
		
		Reader eli = new Reader("Eli", lib);
		Reader gabi = new Reader("Gabi", lib);
		Reader malvi = new Reader("Malvi", lib);
		
		gabi.takeBook(book2);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("Greshka");
		}
		gabi.returnBook();
		
		eli.takeBook(t2);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("Greshka");
		}
		eli.returnBook();
		
		malvi.takeBook(t2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Greshka");
		}
		malvi.returnBook();

		
		
		
	}
}