package oop.encapsulation.Ex206_235.task228;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Tv t[] = {new Tv("Haylur",20,00),
                new Tv("Kargin haxordum", 18, 20),
                new Tv("Azizyanner",18,50),
                new Tv("Full House",19,32),
                new Tv("hndkakan seryal",17,10)};

        for(int i = 0; i< n; i++){
             if((t[i].getHours() == 19 && t[i].getMinute() > 30) || (t[i].getHours() > 19 )) {
                System.out.println(t[i].getTitle());
             }
         }
    }
}