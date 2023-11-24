package oop.inheritance.level_2.task6;

public class BookList extends Library{
    private Library books[] = {
            new Library("100 tarva menutyun", 750, 5000,10),
            new  Library("Anna Karinina", 400, 4500,15),
            new  Library("Sireli barekam", 530,4000,10)
    };
    public void printBook(){
        for (Library book : books) {
            System.out.println(book);
        }
    }
    public void printDiscountedBook(){
        for (Library book:books) {
            book.setPrice(book.price - book.price* book.rebate/100);
            System.out.println(book);
        }
    }
}
