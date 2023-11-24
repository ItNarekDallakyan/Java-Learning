package oop.encapsulation.Ex206_235.task226;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Library lib[] = {   new Library("Alaverdyan",200,5000),
                new Library("Vardanyan", 300, 2000),
                new Library("Ananyan",250,4500),
                new Library("Abrahamyan",100,2300),
                new Library("Araqelyan",680,4700)};
        int k = 250;
        for(int i = 0; i< n; i++){
             if(lib[i].getPage() > k) {
                lib[i].setPrice(lib[i].getPrice() * 2);
             }
         }
        for (Library library : lib){
            System.out.println(library);
        }
    }
}