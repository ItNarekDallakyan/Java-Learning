package oop.encapsulation.Ex206_235.task209;

class Student{

    private String lastName;
    private int  appraisal;
    private int number;

    public Student() {
    }

    public Student(String lastName, int appraisal, int number) {
        this.lastName = lastName;
        this.appraisal = appraisal;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return   number +" "+ lastName ;
    }
}