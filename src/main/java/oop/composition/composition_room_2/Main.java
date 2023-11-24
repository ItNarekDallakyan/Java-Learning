package oop.composition.composition_room_2;


public class Main {

    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Light l1 = new Light("Bright warm");
        Light l2 = new Light("gentle warm");
        Bed myBed = new Bed("twin");

        MyRoom myBR = new MyRoom(w1, w2, l1, l2, myBed);
        myBR.makeBed();

        myBR.getLightColor(l1);
        myBR.checkLight(l1);
        myBR.turnLightOn(l1);
        myBR.checkLight(l1);

        myBR.checkWindow(w1);
        myBR.openWindow(w1);
        myBR.checkWindow(w1);
        myBR.closeWindow(w1);
        myBR.checkWindow(w1);


    }

}
