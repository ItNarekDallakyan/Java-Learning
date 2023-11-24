package oop.inheritance.level_2.task13;

public class Worker extends RetingWorker {
    protected String lastName;
    protected String position;
    protected int salary;

    public Worker() {
    }

    public Worker(int reting, String lastName, String position, int salary) {
        super(reting);
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", reting=" + reting +
                '}';
    }
}