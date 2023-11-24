package oop.encapsulation.Ex206_235.task230;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Lesson lessons[] = {new Lesson("Matematika", 20, 15),
                new Lesson("Ashxarhagrutyun", 19,17),
                new Lesson("Fizika",18,10),
                new Lesson("Qimia",18,12),
                new Lesson("Kensabanutyun", 19,17)};
       int a = 19;
       int b = 15;
        for(int i = 0; i< n; i++){
             if(lessons[i].getReting() >= a && lessons[i].getAppraisal() > b ) {
                System.out.println(lessons[i]);
             }
         }
    }
}