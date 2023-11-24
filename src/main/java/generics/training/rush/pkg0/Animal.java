package generics.training.rush.pkg0;

public class Animal {

  private int id;
  private String name;

  public Animal() {
  }

  public Animal(int id) {
    this.id = id;
  }

  public Animal(int id, String name) {
    this.id = id;
    this.name = name;
  }

  void eat(){
    System.out.println("Animal is eating");
  }

  @Override
  public String toString() {
    return "Animal{id=" + id + ", name='" + name + '\'' + '}';
  }
}
