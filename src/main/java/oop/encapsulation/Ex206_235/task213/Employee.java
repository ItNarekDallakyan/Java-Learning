package oop.encapsulation.Ex206_235.task213;

class Employee{
    private String lastName;
    private int numberOfFamilyMembers;
    private int salary;

    public Employee() {
    }

    public Employee(String lastName, int numberOfFamilyMembers, int salary) {
        this.lastName = lastName;
        this.numberOfFamilyMembers = numberOfFamilyMembers;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfFamilyMembers() {
        return numberOfFamilyMembers;
    }

    public void setNumberOfFamilyMembers(int numberOfFamilyMembers) {
        this.numberOfFamilyMembers = numberOfFamilyMembers;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return    lastName ;
    }
}