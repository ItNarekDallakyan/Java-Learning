package oop.encapsulation.Ex206_235.task233;

class Song{
    private String name;
    private int time;
    private String aoutherName;


    public Song() {
    }

    public Song(String name, int time, String aoutherName) {
        this.name = name;
        this.time = time;
        this.aoutherName = aoutherName;
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

    public String getAoutherName() {
        return aoutherName;
    }

    public void setAoutherName(String aoutherName) {
        this.aoutherName = aoutherName;
    }

    @Override
    public String toString() {
        return aoutherName+ " - "+name;
    }
}