package oop.encapsulation.Ex206_235.task224;

class Library{

    private String lastName;
    private int page;

    public Library() {
    }

    public Library(String lastName, int page) {
        this.lastName = lastName;
        this.page = page;
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

    @Override
    public String toString() {
        return   lastName +" " + page;
    }
}