package oop.encapsulation.Ex206_235.task206;

class Student{
  private String firstName;
  private String lastName;
  private int  numberOfMissing;

     public Student() {
     }

     public Student(String firstName, String lastName, int numberOfMissing) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.numberOfMissing = numberOfMissing;
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

     int getNumberOfMissing() {
         return numberOfMissing;
     }

     public void setNumberOfMissing(int numberOfMissing) {
         this.numberOfMissing = numberOfMissing;
     }

     @Override
     public String toString() {
         return  firstName + " "+ lastName ;
     }
 }