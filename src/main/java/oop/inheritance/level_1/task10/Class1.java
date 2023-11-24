package oop.inheritance.level_1.task10;

public class Class1 {
    protected Computer computers[] = {
            new Computer("Asus X570UD-E4287",3),
            new Computer("Acer Aspire A515-51",1),
            new Computer("HP 250 G6",5),
            new Computer("Dell Inspiron ",8),
            new Computer("Asus ROG GL502VS-US71",16)
    };
}
class Computer{
    private String name;
    private int ram;

    public Computer(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
