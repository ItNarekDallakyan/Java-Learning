package oop.encapsulation.Ex206_235.task224;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Library lib[] = {   new Library("Alaverdyan",180),
                new Library("Vardanyan",120),
                new Library("Ananyan",190),
                new Library("Abrahamyan",210),
                new Library("Araqelyan",105)};

        int sum = 0;
        for(int i = 0; i< n; i++){
             if(lib[i].getLastName().startsWith("A")) {
                 sum += lib[i].getPage();
             }
         }
         System.out.print(sum);
    }
}