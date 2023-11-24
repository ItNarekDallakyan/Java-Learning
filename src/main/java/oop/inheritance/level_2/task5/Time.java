package oop.inheritance.level_2.task5;

public class Time {
    private int hours;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hours, int minute, int second) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
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

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hours + ":" + minute + ":" + second;
    }
}
