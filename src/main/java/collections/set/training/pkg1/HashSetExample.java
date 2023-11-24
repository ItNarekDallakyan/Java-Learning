package collections.set.training.pkg1;


import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Book> set = new HashSet<>();


        Book b1 = new Book(101, "Jungle", "Pre", "Publiser", 5);
        Book b2 = new Book(102, "Ananun", "Pres", "Publiser", 7);
        Book b3 = new Book(103, "Higi", "Prel", "Publiser", 8);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for (Book b :set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}

class Book {
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
}
