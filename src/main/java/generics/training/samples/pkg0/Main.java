package generics.training.samples.pkg0;

class Main{
  public static void main (String[] args)
  {
    // instance of Integer type
    Test <Integer> iObj = new Test<>(15);
    System.out.println(iObj.getObject());

    // instance of String type
    Test <String> sObj = new Test<>("IT_HOME");
    System.out.println(sObj.getObject());
  }
}