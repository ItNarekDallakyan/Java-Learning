package generics.training.samples.pkg2;

class Test {

  private static <T> void genericDisplay(T element) {
    System.out.println(element);
    System.out.println(element.getClass().getName() + " = " + element);
  }

  public static void main(String[] args) {

    genericDisplay(11);

    genericDisplay("IT-Home");

    genericDisplay(1.0);

    genericDisplay(true);

  }
}