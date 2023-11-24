package oop.inheritance.level_1.task16;

public class Phone {
    protected int ram = 5;
    protected int speed = 40;
    protected int weight = 155;
    protected int price ;

        public Phone() {
            calculatePrice();
        }

        private void calculatePrice(){
            this.price =  (ram + weight)/speed;

        }

    public Phone(int ram, int speed, int weight, int price) {
        this.ram = ram;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", speed=" + speed +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}