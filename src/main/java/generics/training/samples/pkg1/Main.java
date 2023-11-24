package generics.training.samples.pkg1;

class Main {
  public static void main(String[] args) {
    Test<String, Integer> obj = new Test<>("IT-HOME", 15);
    obj.print();
  }
}