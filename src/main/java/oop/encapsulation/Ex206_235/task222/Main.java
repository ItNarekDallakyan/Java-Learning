package oop.encapsulation.Ex206_235.task222;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Student student[] = {   new Student("Bagratyan",18,"Erevan"),
                new Student("Vardanyan",28,"Gyumri"),
                new Student("Davtyan",19,"Lori"),
                new Student("Abrahamyan",20,"Erevan"),
                new Student("Kostanyan",22,"Erevan")};


        for(int i = 0; i< n; i++){
             if(student[i].getAge() > 20 && student[i].getBirthplace().equals("Erevan")){
                     System.out.println(student[i]);
                }
         }

    }
}