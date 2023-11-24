package oop.composition.my_composition;

public class Monitor {
    private String name;

    public Monitor(String name){
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
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
