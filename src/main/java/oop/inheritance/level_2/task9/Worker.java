package oop.inheritance.level_2.task9;

public class Worker extends WorkerProfession{
    protected String lastName;
    protected int salary;
    protected int birthYear;

    public Worker() {
    }

    public Worker(String profession, String lastName, int salary, int birthYear) {
        super(profession);
        this.lastName = lastName;
        this.salary = salary;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthYear=" + birthYear ;

    }
}