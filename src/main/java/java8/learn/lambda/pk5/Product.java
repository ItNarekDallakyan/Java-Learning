package java8.learn.lambda.pk5;

public class Product {

  private String id;
  private String name;
  private long price;
  private int quantity;
  private String manufacturer;

  public Product() {
  }

  public Product(String id, String name, long price, int quantity, String manufacturer) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.manufacturer = manufacturer;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public long getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public String toString() {
    return "Product{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            ", manufacturer='" + manufacturer + '\'' +
            '}';
  }
}
