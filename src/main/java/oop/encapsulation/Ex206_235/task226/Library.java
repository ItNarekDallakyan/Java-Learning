package oop.encapsulation.Ex206_235.task226;

class Library{

    private String lastName;
    private int page;
    private int price;

    public Library() {
    }

    public Library(String lastName, int page, int price) {
        this.lastName = lastName;
        this.page = page;
        this.price = price;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return   lastName +" " + price;
    }
}