package oop.composition.composition_room_1;

/**
 * Created by Bill on 5/26/17.
 */
public class HouseOneRoom {
    private TV theTV;
    private Sink theSink;
    private Stove theStove;

    public HouseOneRoom(TV theTV, Sink theSink, Stove theStove) {
        this.theTV = theTV;
        this.theSink = theSink;
        this.theStove = theStove;
    }

    public TV getTheTV() {
        return theTV;
    }

    private Sink getTheSink() {
        return theSink;
    }

    private Stove getTheStove() {
        return theStove;
    }

    public void turnOnStove(){
        getTheStove().turnOnBurners();
    }


}
