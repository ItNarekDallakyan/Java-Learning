package oop.encapsulation.Ex206_235.task216;

class Employee{

    private int numberOfChildren;
    private int salary;

    public Employee() {
    }

    public Employee(int numberOfChildren, int salary) {
        this.numberOfChildren = numberOfChildren;
        this.salary = salary;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return numberOfChildren +"";
    }
}
