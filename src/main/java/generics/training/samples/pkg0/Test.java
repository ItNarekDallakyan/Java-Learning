package generics.training.samples.pkg0;

class Test<T> {
  // An object of type T is declared
  private T obj;

  Test(T obj) {
    this.obj = obj;
  }  // constructor

  T getObject() {
    return this.obj;
  }
}

