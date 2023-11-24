package collections.set.training.pkg2;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Book> set = new TreeSet<>();


        Book b2 = new Book(102, "Ananun", "Pres", "Publiser", 7);
        Book b1 = new Book(101, "Jungle", "Pre", "Publiser", 5);
        Book b3 = new Book(103, "Higi", "Prel", "Publiser", 8);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

    }
}

class Book implements Comparable<Book>  {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {
        if (id < o.id) {
            return 1;
        } else if (id > o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
