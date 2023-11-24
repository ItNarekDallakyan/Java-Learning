package oop.inheritance.level_2.task6;

public class Library extends Book{
    protected int rebate;

    public Library() {
    }

    public Library(String name, int page, int price, int rebate) {
        super(name, page, price);
        this.rebate = rebate;
    }

    public int getRebate() {
        return rebate;
    }

    public void setRebate(int rebate) {
        this.rebate = rebate;
    }

    @Override
    public String toString() {
        return "Library{" +
                "rebate=" + rebate +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }
}