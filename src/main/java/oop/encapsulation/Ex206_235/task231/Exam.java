package oop.encapsulation.Ex206_235.task231;

class Exam {
    private String date;
    private String day;

    public Exam() {
    }

    public Exam(String date, String day) {
        this.date = date;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  date;
    }
}
