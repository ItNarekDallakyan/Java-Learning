package oop.inheritance.level_1.task11;

public class Class1 {
    protected Car cars[] = {
            new Car("Nisan",2007,"mardatar",4),
            new Car("Kamaz",2000,"bernatar",2),
            new Car("Mercedes",2015,"mardatar",4)
    };


}
class Car{
    private String model;
    private int year;
    private String type;
    private int doors;

    public Car(String model, int year, String type, int doors) {
        this.model = model;
        this.year = year;
        this.type = type;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", doors=" + doors +
                '}';
    }
}
