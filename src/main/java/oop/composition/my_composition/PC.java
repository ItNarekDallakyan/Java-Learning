package oop.composition.my_composition;

public class PC {
    private String name;
    private CDRom cdRom;
    private Monitor monitor;

    public PC(String name, CDRom cdRom, Monitor monitor){
        this.name = name;
        this.cdRom = cdRom;
        this.monitor = monitor;
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

    public Monitor getMonitor(){
        return monitor;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public String toString(){
        return "PC{" +
                "name='" + name + '\'' +
                ", cdRom=" + cdRom +
                ", monitor=" + monitor +
                '}';
    }
}
