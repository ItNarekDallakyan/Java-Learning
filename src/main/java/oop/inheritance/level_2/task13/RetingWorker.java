package oop.inheritance.level_2.task13;

public class RetingWorker {
    protected int reting;

    public RetingWorker() {
    }

    public RetingWorker(int reting) {
        this.reting = reting;
    }

    public int getReting() {
        return reting;
    }

    public void setReting(int reting) {
        this.reting = reting;
    }

    @Override
    public String toString() {
        return "RetingWorker{" +
                "reting=" + reting +
                '}';
    }
}

