package oop.inheritance.level_1.task9;

public class Class2 extends Class1 {
    private  String name  = "Intel Core i7-8750H";
    private String ram = "16GB";


    @Override
    public String toString() {
        return "Class2{" +
                "name='" + name + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public void metod(){
       System.out.println(super.toString());
        System.out.println(toString());
    }
}