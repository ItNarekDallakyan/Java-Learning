package oop.encapsulation.Ex206_235.task220;

class Student{
    private String lastName;
    private int stipend;
    private int avg;

    public Student() {
    }

    public Student(String lastName, int stipend, int avg) {
        this.lastName = lastName;
        this.stipend = stipend;
        this.avg = avg;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return lastName +" "+ stipend;
    }
}