package generics.training.rush.pkg3;

public class Test {
  public static void main(String[] args) {

    Animal animal = new Animal() {
      @Override
      public void eatt() {
        System.out.println("Animal is eating");
      }

      @Override
      public int it(int x, int y) {
        return x+y;
      }
    };
    animal.eatt();
    System.out.println(animal.it(5,6));

  }
}

interface Animal{

  void eatt();

  int it(int x, int y);
}
