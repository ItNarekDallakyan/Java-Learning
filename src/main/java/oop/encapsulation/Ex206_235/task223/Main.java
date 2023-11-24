package oop.encapsulation.Ex206_235.task223;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Anna","Alaverdyan",18),
                new Student("Anahit","Vardanyan",12),
                new Student("Sargis","Ananyan",19),
                new Student("Arevik","Abrahamyan",21),
                new Student("Goharik","Araqelyan",15)};


        for(int i = 0; i< n; i++){
             if(student[i].getNumber() >= 11 && student[i].getNumber() <= 20){
                 if(student[i].getFirstName().startsWith("A") && student[i].getLastName().startsWith("A"))
                     System.out.println(student[i]);
                }
         }

    }
}