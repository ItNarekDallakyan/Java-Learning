package oop.composition.my_composition;

public class Charger {
    private String name;


    public Charger(){
    }

    public Charger(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Charger{" +
                "name='" + name + '\'' +
                '}';
    }
}
