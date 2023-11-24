package oop.encapsulation.Ex206_235.task225;

class Library{

    private String lastName;
    private String title;

    public Library() {
    }

    public Library(String lastName, String title) {
        this.lastName = lastName;
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return   lastName +" " + title;
    }
}