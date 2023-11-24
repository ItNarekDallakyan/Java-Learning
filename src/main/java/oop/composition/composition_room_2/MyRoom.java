package oop.composition.composition_room_2;


public class MyRoom {
    private Window window1;
    private Window window2;
    private Light light1;
    private Light light2;
    private Bed myBed;

    public MyRoom(Window window1, Window window2, Light light1, Light light2, Bed myBed) {
        this.window1 = window1;
        this.window2 = window2;
        this.light1 = light1;
        this.light2 = light2;
        this.myBed = myBed;
    }

    public void makeBed() {
        System.out.println("MyRoom -> making my bed...");
        myBed.make();
    }

    public void checkWindow(Window window) {
        System.out.println("MyRoom -> Is window closed? " + window.isWindowClosed());
    }

    public void closeWindow(Window window) {
        System.out.println("MyRoom -> closing window...");
        window.close();
    }

    public void openWindow(Window window) {
        System.out.println("MyRoom -> opening window...");
        window.open();
    }

    public void getLightColor(Light light) {
        System.out.println("MyRoom -> getting light color...");
        light.getLightColor();
    }

    public void checkLight(Light light) {
        System.out.println("MyRoom -> Is light off? " + light.isLightOff());
    }

    public void turnLightOn(Light light) {
        System.out.println("MyRoom -> turning on...");
        light.turnOn();
    }

    public void turnLightOff(Light light) {
        System.out.println("MyRoom -> turning off...");
        light.turnOff();
    }

    public Window getWindow1() {
        return window1;
    }

    public Window getWindow2() {
        return window2;
    }

    public Light getLight1() {
        return light1;
    }

    public Light getLight2() {
        return light2;
    }

    public Bed getMyBed() {
        return myBed;
    }
}
