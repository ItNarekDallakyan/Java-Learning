package oop.inheritance.level_1.task8;

public class Class2 extends Class1 {
    private String model  = "X6";
    private String color = "black";
    private int year = 2010;
    private int price = 19000;

    @Override
    public String toString() {
        return "Class2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void metod(){
       System.out.println(super.toString());
        System.out.println(toString());
    }
}