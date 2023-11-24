package oop.encapsulation.Ex206_235.task210;

class Employee {
    private String firstName;
    private String lastName;
    private int married;
    private int numberOfChildren;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int married, int numberOfChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.married = married;
        this.numberOfChildren = numberOfChildren;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMarried() {
        return married;
    }

    public void setMarried(int married) {
        this.married = married;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}