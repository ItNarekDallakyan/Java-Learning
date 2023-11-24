package oop.inheritance.level_2.task7;

public class BookShop extends Book{
    protected int price;

    public BookShop() {
    }

    public BookShop(String name, String author, int publishedYear, int price) {
        super(name, author, publishedYear);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookShop{" +

                " name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                " , price=" + price +
                '}';
    }
}