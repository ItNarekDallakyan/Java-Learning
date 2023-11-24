package oop.encapsulation.Ex206_235.task229;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Cinema cinemas[] = {new Cinema("Moskva", "Arajn demq"),
                new Cinema("Cinema star", "Txte qaxaq"),
                new Cinema("Nairi","Super mama2"),
                new Cinema("Moskva","Super mama"),
                new Cinema("Moskva","Labirint")};
        String title = "Txte qaxaq";
        for(int i = 0; i< n; i++){
             if(cinemas[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(cinemas[i]);
             }
         }
    }
}