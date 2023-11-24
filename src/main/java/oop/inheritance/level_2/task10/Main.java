package oop.inheritance.level_2.task10;

public class Main {
    public static void main(String[] args) {
        Counter ob = new Counter(18,1,2,3,4);
        System.out.println("a + b + c + d = "+ob.sumNumbers());
        System.out.println("x - (a + b + c + d) = "+ob.subSumNumbers());

    }
}