package oop.encapsulation.Ex206_235.task225;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Library lib[] = {   new Library("Alaverdyan"," hayoc patmutyun"),
                new Library("Vardanyan","karot"),
                new Library("Ananyan","patmutyun"),
                new Library("Abrahamyan","anveradardz trichq"),
                new Library("Araqelyan","kyanqi patmutyun")};

        for(int i = 0; i< n; i++){
             if(lib[i].getTitle().contains("patmutyun")) {
                 System.out.println(lib[i]);
             }
         }
    }
}