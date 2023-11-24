package oop.composition.composition_pc;

public class PC {

    private String name;
    private Ram ram;
    private Hdd hdd;
    private double weight;
    private CDRom cdRom = new CDRom();
    //private pc_composition.CDRom cdRom = new pc_composition.CDRom(); // Amen angam objekt chsaqelu hamar

    public PC(){
    }

    public PC(String name){
        this.name = name;
    }


    public void writeCD(){
        if (cdRom == null) {
            cdRom = new CDRom(); //dimelu jamanak sarqi object
        } else {
            cdRom.writeCD();
        }
    }

}

