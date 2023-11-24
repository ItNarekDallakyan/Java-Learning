package oop.encapsulation.Ex206_235.task234;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Book books[] = {new Book(1, "Askanio",650),
                new Book(14, "The Light Between Worlds ",520),
                new Book(20,"Red Queen",710),
                new Book(17,"Empress of All Seasons ",140),
                new Book(4, "Empress of All Seasons ",250)};
        int sum = 0;
        for(int i = 0; i< n; i++){
             if(books[i].getNumber()% 2 == 0 ) {
               sum += books[i].getPage();
	System.out.println(books[i]);
             }
         }
        System.out.println(sum);
    }
}