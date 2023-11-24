package generics.training.rush.pkg2;

public class Test {
  public static void main(String[] args) {
    KaroxaUti karoxaUti = new Animal();
    karoxaUti.eat();
  }
}

interface KaroxaUti{
  void eat();
}

class Animal implements KaroxaUti{

  @Override
  public void eat() {
    System.out.println("interface eat method");
  }
}
