package oop.inheritance.level_2.task8;

public class Worker {
    protected String lastName;
    protected int salary;
    protected int adoptionYear;

    public Worker() {
    }

    public Worker(String lastName, int salary, int adoptionYear) {
        this.lastName = lastName;
        this.salary = salary;
        this.adoptionYear = adoptionYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAdoptionYear() {
        return adoptionYear;
    }

    public void setAdoptionYear(int adoptionYear) {
        this.adoptionYear = adoptionYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", adoptionYear=" + adoptionYear +
                '}';
    }
}