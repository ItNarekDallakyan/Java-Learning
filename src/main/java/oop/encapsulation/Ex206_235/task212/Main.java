package oop.encapsulation.Ex206_235.task212;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Davtyan",12,1),
                new Student("Stepanyan",8,2),
                new Student("Petrosyan",20,3),
                new Student("Nikoxosyan",17,4),
                new Student("Harutyunyan",19,5)};
        int a =15;
        int b = 19;


        for(int i = 0; i < n; i++){
            if(student[i].getAppraisal() >= a && student[i].getAppraisal() <= b ){
                System.out.println(student[i]);
            }
        }

    }
}