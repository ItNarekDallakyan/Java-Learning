package oop.aggregation;

class Employee {

    private String firstName;
    private String lastName;
    private int empId;
    private String role;

    public Employee(String fName, String lName, int empId, String role){
        this.firstName = fName;
        this.lastName = lName;
        this.empId = empId;
        this.role = role;
    }
}