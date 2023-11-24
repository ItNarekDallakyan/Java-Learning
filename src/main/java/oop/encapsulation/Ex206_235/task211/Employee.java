package oop.encapsulation.Ex206_235.task211;

class Employee{

    private String lastName;

    private int numberOfChildren;

    public Employee() {
    }

    public Employee(String lastName, int numberOfChildren) {

        this.lastName = lastName;
        this.numberOfChildren = numberOfChildren;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public String toString() {
        return    lastName ;
    }
}