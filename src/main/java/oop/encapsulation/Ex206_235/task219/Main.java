package oop.encapsulation.Ex206_235.task219;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",3000,27),
                new Student("Vardanyan",5000,20),
                new Student("Davtyan",9000,18),
                new Student("Abrahamyan",3400,24),
                new Student("Kostanyan",8000,17)};

    int k = 20;
    int average  = 0;
        for(int i = 0; i < n; i++){
            average += student[i].getAvg();
            }
            if(average/n > k){
                for(int i = 0; i< n; i++){
                    student[i].setStipend(student[i].getStipend()*2);

                }
            }
       for (Student student1 : student) {
            System.out.print(student1+"\n");
        }

    }
}