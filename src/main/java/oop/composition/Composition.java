package oop.composition;

import java.util.Scanner;

class Job {
    String role;
    String location;
    int salary;

    public Job(String role, String location, int salary){
        this.role = role;
        this.location = location;
        this.salary = salary;
    }

    public String getRole(){
        return role;
    }

    public String getLocation(){
        return location;
    }

    public int getSalary(){
        return salary;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}

class Person {
    Job j;
    String firstName;
    String lastName;
    int age;
    String jRole;
    String jLocation;
    int jSalary;

    public Person(String firstName, String lastName, int age, String role, String location, int salary){
        this.j = new Job(role, location, salary);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("\nYour Personal Details:\n");
        System.out.print("--------------------\n");
        System.out.print("Name: " + this.firstName.concat(lastName) + "\n");
        System.out.print("Age: " + this.age + "\n");
        System.out.print("Job Role: " + this.j.role + "\n");
        System.out.print("Job Location: " + this.j.location + "\n");
        System.out.print("Salary: " + this.j.salary + "\n");
    }
}

public class Composition {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Personal Details:\n");
        System.out.print("--------------------\n");
        System.out.print("First Name: ");
        String fName = in.next();
        System.out.print("Last Name: ");
        String lName = in.next();
        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.println("Enter Your Job Details:\n");
        System.out.print("--------------------\n");
        System.out.print("Job Role: ");
        String jRole = in.next();
        System.out.print("Job Location: ");
        String jLocation = in.next();
        System.out.print("Salary Details per Month: ");
        int jSalary = in.nextInt();

        Person p = new Person(fName, lName, age, jRole, jLocation, jSalary);
        p.displayDetails();
    /*
    Job j1 = new Job("Developer","Koratty",25000);
    Job j2 = new Job("PM","Calicut",50000);
    Job j3 = new Job("QA","Eranamkulam",35000);
    Job j4 = new Job("Developer","Calicut",25000);
    Job j5 = new Job("QA","Koratty",35000);
    */
    }
}