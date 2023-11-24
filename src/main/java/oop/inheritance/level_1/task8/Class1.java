package oop.inheritance.level_1.task8;

public class Class1 {
    protected String model  = "X5";
    protected String color = "black";
    protected int year = 2006;
    protected int price = 9000;

    @Override
    public String toString() {
        return "Class1{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
