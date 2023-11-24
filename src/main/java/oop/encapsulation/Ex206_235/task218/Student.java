package oop.encapsulation.Ex206_235.task218;

class Student{
    private String lastName;
    private int rating;
    private int point;

    public Student() {
    }

    public Student(String lastName, int rating, int point) {
        this.lastName = lastName;
        this.rating = rating;
        this.point = point;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return lastName +" "+ rating +" " + point;
    }
}