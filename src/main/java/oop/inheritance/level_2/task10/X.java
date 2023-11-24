package oop.inheritance.level_2.task10;

public class X {
    protected int x;

    public X() {
    }

    public X(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "X{" +
                "x=" + x +
                '}';
    }
}