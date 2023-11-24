package oop.inheritance.level_1.task14;

public class Class1 {
    protected int weight = 2;
    protected int power= 5;
    protected String color ="black";

    public Class1() {

    }

    public Class1(int weight, int power, String color) {
        this.weight = weight;
        this.power = power;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}

