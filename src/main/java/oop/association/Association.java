package oop.association;

import java.util.*;


class Company {
    String name;
    String branch;

    public Company(String name, String branch){
        this.name = name;
        this.branch = branch;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getBranch(){
        return branch;
    }

    public void displayAssociation(Employee e){
        System.out.print("--------------------\n");
        System.out.println(e.getName() + " is working on " + this.getName() + " at " + this.getBranch() + " branch.");
        System.out.println("Details of Employee\n");
        System.out.println("Employee Id: " + e.getEmpId());
        System.out.println("Designation: " + e.getDesignation() + "\n");
        System.out.print("--------------------\n");
    }
}

class Employee {
    int age;
    int empId;
    String firstName;
    String lastName;
    String workLocation;
    String designation;

    public Employee(String fName, String lName, int age, int empId, String workLoc, String desig){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.empId = empId;
        this.workLocation = workLoc;
        this.designation = desig;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setWorkLocation(String workLocation){
        this.workLocation = workLocation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getWorkLocation(){
        return workLocation;
    }

    public String getDesignation(){
        return designation;
    }

    public int getEmpId(){
        return empId;
    }

    public String getName(){
        String name = firstName.concat(" " + lastName);
        return name;
    }
}

public class Association {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Personal Details:\n");
        System.out.print("First Name: ");
        String fName = in.next();
        System.out.print("Last Name: ");
        String lName = in.next();
        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.print("Employee Id: ");
        int empId = in.nextInt();
        System.out.print("Work Location: ");
        String workLoc = in.next();
        System.out.print("Designation: ");
        String desig = in.next();

        System.out.println("Enter Company Details:\n");
        System.out.print("Company Name: ");
        String cName = in.next();
        System.out.print("Branch: ");
        String branch = in.next();
        System.out.print("\n");

        Employee e = new Employee(fName, lName, age, empId, workLoc, desig);
        Company c = new Company(cName, branch);

        c.displayAssociation(e);
    }
}
