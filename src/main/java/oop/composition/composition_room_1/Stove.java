package oop.composition.composition_room_1;


/**
 * Created by Bill on 5/26/17.
 */
public class Stove {
    private int burners;
    private int currentTemp;
    private boolean electric;

    public Stove(int burners, int currentTemp, boolean electric) {
        this.burners = burners;
        this.currentTemp = currentTemp;
        this.electric = electric;
    }

    public int getBurners() {
        return burners;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public boolean isElectric() {
        return electric;
    }

    public void turnOnBurners(){
        System.out.println("The burners are burning!");
    }


}
