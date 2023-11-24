package oop.encapsulation.Ex206_235.task208;

class Student{
    private String firstName;
    private String lastName;
    private int  appraisal;

    public Student() {
    }

    public Student(String firstName, String lastName, int appraisal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.appraisal = appraisal;
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

    public int getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int appraisal) {
        this.appraisal = appraisal;
    }

    @Override
    public String toString() {
        return  firstName + " "+ lastName + " "+ appraisal;
    }
}