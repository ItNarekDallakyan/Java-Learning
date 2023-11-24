package oop.encapsulation.Ex206_235.task221;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",3,27),
                new Student("Vardanyan",5,20),
                new Student("Davtyan",9,18),
                new Student("Abrahamyan",3,10),
                new Student("Kostanyan",8,1)};

        final int K = 5;
        for(int i = 0; i< n; i++){
             if(student[i].getNumber() >=10 && student[i].getNumber()<= 20){
                 if(student[i].getAppraisal() > K)
                     System.out.println(student[i]);
                }
         }

    }
}