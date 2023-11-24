package oop.encapsulation.Ex206_235.task222;

class Student{
    private String lastName;
    private int age;
    private String birthplace;

    public Student() {
    }

    public Student(String lastName, int age, String birthplace) {
        this.lastName = lastName;
        this.age = age;
        this.birthplace = birthplace;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return lastName +"";
    }
}