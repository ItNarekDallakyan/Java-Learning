package generics.training.rush.pkg1;

public class Main {
  public static void main(String[] args) {

    Animal animal = new Animal();
    animal.eat();

    Animal anima2 = new Animal() {
      void eat() {
        System.out.println("Animal 2 is eating");
      }
    };
    anima2.eat();
  }
}

class Animal {

  void eat() {
    System.out.println("Animal is eating");
  }
}

