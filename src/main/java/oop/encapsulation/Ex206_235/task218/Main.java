package oop.encapsulation.Ex206_235.task218;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",30,27),
                new Student("Vardanyan",5,20),
                new Student("Davtyan",9,15),
                new Student("Abrahamyan",34,24),
                new Student("Kostanyan",8,12)};



        for(int i = 0; i < n; i++){
            if(student[i].getRating()>= 5  && student[i].getRating()<=10){
                if(student[i].getPoint()>= 10 && student[i].getPoint() <= 20){
                    System.out.println(student[i]);
                }
            }
        }
    }
}