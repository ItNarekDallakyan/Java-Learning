package oop.composition.my_composition;

public class Main {
    public static void main(String[] args){


        Monitor monitor = new Monitor("LG");
        Camera camera = new Camera("Sony");
        Charger charger = new Charger("Vega Charger");
        CDRom cdRom = new CDRom("Wima");

        Notebook notebook = new Notebook("Vaio", cdRom, charger, camera);
        System.out.println(notebook);

        PC pc = new PC("Asus", cdRom, monitor);
        System.out.println(pc);

        System.out.println();

        Electronic electronic = new Electronic(notebook,pc);
        System.out.println(electronic);

    }
}
