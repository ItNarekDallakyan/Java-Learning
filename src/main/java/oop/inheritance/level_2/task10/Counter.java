package oop.inheritance.level_2.task10;

public class Counter extends Numbers{
    public Counter() {
    }

    public Counter(int x, int a, int b, int c, int d) {
        super(x, a, b, c, d);
    }

    public int sumNumbers(){
        return a+b+c+d;
    }
    public int subSumNumbers(){
        return x - sumNumbers();
    }
}
