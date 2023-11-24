package oop.composition.composition_room_1;

/**
 * Created by Bill on 5/26/17.
 */
public class Sink {
    private boolean hot;
    private boolean cold;
    private boolean clogged;

    public Sink(boolean hot, boolean cold, boolean clogged) {
        this.hot = hot;
        this.cold = cold;
        this.clogged = clogged;
    }

    public boolean isHot() {
        return hot;
    }

    public boolean isCold() {
        return cold;
    }

    public boolean isClogged() {
        return clogged;
    }
}
