package oop.composition.composition_pc;

public class CDRom {
    private  String name;
    private double speed;
    private boolean cdWritable;


    public void writeCD(){
        if (cdWritable){
            System.out.println("Writing_CD");
        }else {
            System.out.println("The cd is not writable");
        }
    }

    public void openCD(){
        System.out.println("Open_CD_ROM");
    }

    public void closeCD(){
        System.out.println("Close_CD_ROM");
    }

    public void readCD(){
        System.out.println("Reading_CD");
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public boolean isCdWritable(){
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable){
        this.cdWritable = cdWritable;
    }
}
