package oop.inheritance.level_2.task7;

public class BookList extends BookShop{
    private BookShop books[] = {
            new  BookShop("100 tarva menutyun","Gabriel Garsia Markes" ,1967,4000),
            new  BookShop("Anna Karinina","Lev Tolstoy" , 1878,5000),
            new  BookShop("Erkri hakarak koxmy","Nikol Pashinyan" ,2008,6000),
            new  BookShop("Every Day","Every Day" ,2018,6000)
    };
    public void printBook(){
        for (BookShop book : books) {
            if(2018 - book.publishedYear >=5){
                book.setPrice(book.price - book.price*20/100);
                System.out.println(book);
            }
        }
    }

}