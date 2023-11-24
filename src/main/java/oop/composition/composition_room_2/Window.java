package oop.composition.composition_room_2;


public class Window {

    private boolean isWindowClosed;

    public Window() {
        this.isWindowClosed = true;
    }

    public void open() {
        System.out.println("Window -> Window is opened.");
        this.isWindowClosed = false;
    }

    public void close() {
        System.out.println("Window -> Window is closed.");
        this.isWindowClosed = true;
    }

    public boolean isWindowClosed() {
        return isWindowClosed;
    }
}
