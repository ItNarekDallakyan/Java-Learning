package oop.encapsulation.Ex206_235.task232;

class Song{
    private String name;
    private int time;

    public Song(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Song() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  name ;
    }
}