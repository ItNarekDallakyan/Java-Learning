package oop.encapsulation.Ex206_235.task207;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Hermine","Xazaryan",12),
                                new Student("Ashot","Stepanyan",18),
                                new Student("Davit","Petrosyan",20),
                                new Student("Hayarpi","Nikoxosyan",20),
                                new Student("Mari","Harutyunyan",19)};


        int sum = 0;
        for(int i= 0; i < n ; i++){
            sum += student[i].getAppraisal();
        }

        int avg = sum / n;
        for(int i = 0; i < n; i++){
            if(student[i].getAppraisal() > avg){
                System.out.println(student[i]);
            }
        }

    }
}