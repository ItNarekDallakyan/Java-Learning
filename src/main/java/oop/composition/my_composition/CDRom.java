package oop.composition.my_composition;

public class CDRom {
    private String name;

    public CDRom(String name){
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
        return "CDRom{" +
                "name='" + name + '\'' +
                '}';
    }
}
