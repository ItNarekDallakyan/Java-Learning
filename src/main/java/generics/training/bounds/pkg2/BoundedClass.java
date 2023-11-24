package generics.training.bounds.pkg2;

//Multiple bounds
class Bound<T extends A & B> {

  private T objRef;

  public Bound(T obj) {
    this.objRef = obj;
  }

  public void doRunTest() {
    this.objRef.displayClass();
  }
}

interface B {
  void displayClass();
}

class A implements B {
  public void displayClass() {
    System.out.println("Inside super class A");
  }
}

public class BoundedClass {
  public static void main(String a[]) {
    Bound<A> bea = new Bound<>(new A());
    bea.doRunTest();

  }
} 