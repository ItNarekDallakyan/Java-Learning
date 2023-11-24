package oop.composition.my_composition;

public class Notebook {
    private String name;
    private CDRom cdRom;
    private Charger charger;
    private Camera camera;


    public Notebook(String name, CDRom cdRom, Charger charger, Camera camera){
        this.name = name;
        this.cdRom = cdRom;
        this.charger = charger;
        this.camera = camera;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public CDRom getCdRom(){
        return cdRom;
    }

    public void setCdRom(CDRom cdRom){
        this.cdRom = cdRom;
    }

    public Charger getCharger(){
        return charger;
    }

    public void setCharger(Charger charger){
        this.charger = charger;
    }

    public Camera getCamera(){
        return camera;
    }

    public void setCamera(Camera camera){
        this.camera = camera;
    }

    @Override
    public String toString(){
        return "Notebook{" +
                "name='" + name + '\'' +
                ", cdRom=" + cdRom +
                ", charger=" + charger +
                ", camera=" + camera +
                '}';
    }
}
