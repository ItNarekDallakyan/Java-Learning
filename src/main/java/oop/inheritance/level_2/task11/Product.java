package oop.inheritance.level_2.task11;

public class Product extends ProductionInfo{
    protected String name;
    protected int price;
    protected String productor;

    public Product() {
    }

    public Product(int productionYear, int rebate, String name, int price, String productor) {
        super(productionYear, rebate);
        this.name = name;
        this.price = price;
        this.productor = productor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productor='" + productor + '\'' +
                '}';
    }
}