package oop.polymorphism.level_1.task1;

public class Computer {

private String procesorName;
private double frequency;
private int ram;

    public Computer() {
    }

    public Computer(String procesorName, double frequency, int ram) {
        this.procesorName = procesorName;
        this.frequency = frequency;
        this.ram = ram;
    }

    public double Q(){
    return (0.1*frequency)+ram;
}

void info(){
    System.out.println(procesorName+" "+frequency+" "+ram );
}


}
