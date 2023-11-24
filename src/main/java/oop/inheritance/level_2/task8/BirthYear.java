package oop.inheritance.level_2.task8;

public class BirthYear extends Worker{
    protected int year;

    public BirthYear() {
    }

    public BirthYear(String lastName, int salary, int adoptionYear, int year) {
        super(lastName, salary, adoptionYear);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  " lastName='" + lastName + '\'' +
                ", salary=" + salary +
                " , birthYear=" + year +
                ", adoptionYear=" + adoptionYear   ;
    }
}