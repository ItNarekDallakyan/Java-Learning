package oop.encapsulation.Ex206_235.task231;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Exam exams[] = {new Exam("12/02/2018","shabat"),
                new Exam("15/03/2018","urbat"),
                new Exam("20/3/2018","erkushabti"),
                new Exam("1/05/2017","shabat"),
                new Exam("12/02/2019","choreqshabti")};

        for(int i = 0; i< n; i++){
             if( exams[i].getDay().equalsIgnoreCase("shabat")) {
                System.out.println(exams[i]);
             }
         }
    }
}