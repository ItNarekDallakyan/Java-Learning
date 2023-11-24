package oop.encapsulation.Ex206_235.task208;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Hermine","Xazaryan",12),
                new Student("Ashot","Stepanyan",8),
                new Student("Davit","Petrosyan",20),
                new Student("Hayarpi","Nikoxosyan",20),
                new Student("Mari","Harutyunyan",19)};



        for(int i = 0; i < n; i++){
            if(student[i].getAppraisal() >= 10 && student[i].getAppraisal() <= 20 ){
                System.out.println(student[i]);
            }
        }

    }
}