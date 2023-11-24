package oop.inheritance.level_1.task15;

public class IPhone8 extends IPhone7 {
    private String Camera = "12 Mp";
    private String color = "Silver";

    public IPhone8() {
    }

    public IPhone8(String firstPresented, String speed, String sim, String camera, String color) {
        super(firstPresented, speed, sim);
        Camera = camera;
        this.color = color;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "IPhone8{" +
                "Camera='" + Camera + '\'' +
                ", color='" + color + '\'' +
                ", firstPresented='" + firstPresented + '\'' +
                ", speed='" + speed + '\'' +
                ", sim='" + sim + '\'' +
                '}';
    }

    public void metod(){
        System.out.print(toString());
    }
}