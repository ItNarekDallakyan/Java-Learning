package oop.encapsulation.Ex206_235.task232;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Song songs[] = {new Song("On The Floor", 2),
                new Song("Despacito", 1),
                new Song("Shape of You",5),
                new Song("See You Again",4),
                new Song("Faded", 3)};

        for(int i = 0; i< n; i++){
             if(songs[i].getTime() <= 3 ) {
                System.out.println(songs[i]);
             }
         }
    }
}