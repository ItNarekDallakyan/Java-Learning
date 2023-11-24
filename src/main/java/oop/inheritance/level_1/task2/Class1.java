package oop.inheritance.level_1.task2;

public class Class1 {
    protected int dolar = 485;

    public Class1() {
    }

    public Class1(int dolar) {
        this.dolar = dolar;
    }

    public int getDolar() {
        return dolar;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "dolar=" + dolar +
                '}';
    }
}