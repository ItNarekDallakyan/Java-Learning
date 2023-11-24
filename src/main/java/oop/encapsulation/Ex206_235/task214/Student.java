package oop.encapsulation.Ex206_235.task214;

class Student{
    private String firstName;
    private String lastName;
    private String fatherland;


    public Student() {
    }

    public Student(String lastName, String firstName, String fatherland) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherland = fatherland;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherland() {
        return fatherland;
    }

    public void setFatherland(String fatherland) {
        this.fatherland = fatherland;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return    lastName +  " " +firstName  +" "+ fatherland;
    }
}