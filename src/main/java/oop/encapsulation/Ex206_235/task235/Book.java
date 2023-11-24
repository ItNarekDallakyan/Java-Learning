package oop.encapsulation.Ex206_235.task235;

class Book{
    private int number;
    private String title;
    private int page;

    public Book() {
    }

    public Book(int number, String title, int page) {
        this.number = number;
        this.title = title;
        this.page = page;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return number  + " "+title;
    }
}