package oop.encapsulation.Ex206_235.task206;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Hermine","Xazaryan",12),
                                new Student("Ashot","Stepanyan",1),
                                new Student("Davit","Petrosyan",3),
                                new Student("Hayarpi","Nikoxosyan",15),
                                new Student("Mari","Harutyunyan",10)};

        int max = student[0].getNumberOfMissing();
        int index = 0;
        for(int i = 1; i < n; i++){
            if(student[i].getNumberOfMissing() > max){
                max = student[i].getNumberOfMissing();
                index = i;
            }
        }

        System.out.println(student[index]);
    }
}