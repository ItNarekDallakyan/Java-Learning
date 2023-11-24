package oop.encapsulation.Ex206_235.task228;

class Tv{

    private String title;
    private int hours;
    private int minute;

    public Tv() {
    }

    public Tv(String title, int hours, int minute) {
        this.title = title;
        this.hours = hours;
        this.minute = minute;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return  title ;
    }
}