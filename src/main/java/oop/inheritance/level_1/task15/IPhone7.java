package oop.inheritance.level_1.task15;

public class IPhone7 {
    protected String firstPresented = "2016, September";
    protected String speed ="HSPA 42.2/5.76 Mbps";
    protected String sim = "Nano-SIM";

    public IPhone7() {
    }

    public IPhone7(String firstPresented, String speed, String sim) {
        this.firstPresented = firstPresented;
        this.speed = speed;
        this.sim = sim;
    }

    public String getFirstPresented() {
        return firstPresented;
    }

    public void setFirstPresented(String firstPresented) {
        this.firstPresented = firstPresented;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "Iphone7{" +
                "firstPresented='" + firstPresented + '\'' +
                ", speed='" + speed + '\'' +
                ", sim='" + sim + '\'' +
                '}';
    }
}

