package oop.encapsulation.Ex206_235.task217;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",30,27),
                new Student("Vardanyan",31,20),
                new Student("Davtyan",32,10),
                new Student("Abrahamyan",34,24),
                new Student("Kostanyan",8,12)};

        final int K = 10;

        for(int i = 0; i < n; i++){
            if(student[i].getRating()-student[i].getPoint()< K){
                System.out.println(student[i]);
            }
        }
    }
}