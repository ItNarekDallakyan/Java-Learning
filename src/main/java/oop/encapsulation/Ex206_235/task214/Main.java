package oop.encapsulation.Ex206_235.task214;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Davtyan","Anahit","Serobi"),
                new Student("Stepanyan","Hamlet","Martini"),
                new Student("Arshakyan","Susanna","Gevorgi"),
                new Student("Nikoxosyan","Tigran", "Igori"),
                new Student("Abgaryan","Mareta","Kareni")};


        for(int i = 0; i < n; i++){
            if(student[i].getLastName().startsWith("A")&& student[i].getLastName().endsWith("n")){
                System.out.println(student[i]);
            }
        }

    }
}