package oop.encapsulation.Ex206_235.task209;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {new Student("Xazaryan",12, 1),
                new Student("Stepanyan",8,2),
                new Student("Petrosyan",20, 3),
                new Student("Nikoxosyan",20,4),
                new Student("Harutyunyan",19,5)};



        for(int i = 0; i < n; i++){
            if(student[i].getAppraisal() >= 0 && student[i].getAppraisal() <= 9 ){
                System.out.println(student[i]);
            }
        }

    }
}