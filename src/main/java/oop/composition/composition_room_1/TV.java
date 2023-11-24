package oop.composition.composition_room_1;

/**
 * Created by Bill on 5/26/17.
 */
public class TV {
    private String manufacturer;
    private int channels;
    private int size;


    public TV(String manufacturer, int channels, int size) {

        this.manufacturer = manufacturer;
        this.channels = channels;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getChannels() {
        return channels;
    }

    public int getSize() {
        return size;
    }

    public void powerOn(){
        System.out.println("Turned the tv on!");
    }


}
