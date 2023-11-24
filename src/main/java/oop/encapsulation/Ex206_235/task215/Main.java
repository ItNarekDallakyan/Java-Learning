package oop.encapsulation.Ex206_235.task215;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student(15,27),
                new Student(31,20),
                new Student(32,10),
                new Student(34,24),
                new Student(8,12)};

        int count = 0;
        for(int i = 0; i < n; i++){
            if(student[i].getRating()>= 31 && student[i].getRating()<=35){
                if(student[i].getPoint()>= 19 && student[i].getPoint() <= 24){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}