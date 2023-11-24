package oop.encapsulation.Ex206_235.task220;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",3000,27),
                new Student("Vardanyan",5000,20),
                new Student("Davtyan",9000,18),
                new Student("Abrahamyan",3400,10),
                new Student("Kostanyan",8000,17)};

    int a = 15;
    int b = 20;


    for(int i = 0; i< n; i++){
        if(student[i].getAvg()>=a && student[i].getAvg() <= b){
            student[i].setStipend(student[i].getStipend()*2);
        }else{
            if(student[i].getAvg() > b){
                student[i].setStipend(student[i].getStipend()*3);
            }
        }
    }

       for (Student student1 : student) {
            System.out.print(student1+"\n");
        }

    }
}