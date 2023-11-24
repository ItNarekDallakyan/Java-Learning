package oop.polymorphism.level_1.task1;

public class ComputerInheritor extends Computer {
    private int p;

    public ComputerInheritor(String procesorName, double frequency, int ram, int p) {
        super(procesorName, frequency, ram);
        this.p = p;
    }

    public ComputerInheritor(String prcessorName, double frequency, int p) {

    }


    @Override
    public double Q() {
        return super.Q() + 0.5 * p;
    }
}