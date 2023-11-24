package oop.encapsulation.Ex206_235.task233;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Song songs[] = {new Song("On The Floor", 2,"Jennifer Lopez"),
                new Song("Despacito", 1,"Luis Fonsi"),
                new Song("Shape of You",5,"Ed Sheeran"),
                new Song("See You Again",4,"Wiz Khalifa"),
                new Song("Faded", 3,"Alan Walker")};
        int k = 4;
        for(int i = 0; i< n; i++){
             if(songs[i].getTime() == k ) {
                System.out.println(songs[i]);
             }
         }
    }
}