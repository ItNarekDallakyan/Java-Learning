package oop.polymorphism.level_1.task1;

public class Main {
    public static void main(String[] args) {

        Computer computer = new ComputerInheritor("I7",233.0,2048);
        Computer computer2 = new ComputerInheritor("I7",233.0,2048,35);


        System.out.println( computer.Q());
        System.out.println(computer2.Q());


    }
}