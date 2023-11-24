package oop.encapsulation.Ex206_235.task215;

class Student{
    private int rating;
    private int point;

    public Student() {
    }

    public Student(int rating, int point) {
        this.rating = rating;
        this.point = point;
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
}