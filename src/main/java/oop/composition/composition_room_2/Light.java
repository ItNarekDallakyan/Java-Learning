package oop.composition.composition_room_2;


public class Light {
    private String lightColor;
    private boolean isLightOff;

    public Light(String lightColor) {
        this.lightColor = lightColor;
        this.isLightOff = true;
    }

    public void turnOn() {
        System.out.println("Light -> light is on");
        this.isLightOff = false;
    }

    public void turnOff() {
        System.out.println("Light -> light is off");
        this.isLightOff = true;
    }

    public String getLightColor() {
        System.out.println("Light -> this light color is " + lightColor);
        return lightColor;
    }

    public boolean isLightOff() {
        return isLightOff;
    }
}
