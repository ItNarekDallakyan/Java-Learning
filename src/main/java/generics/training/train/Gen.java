package generics.training.train;

import java.util.ArrayList;
import java.util.List;

public class Gen {
  public static void main(String[] args) {

    List<String> x = new ArrayList<>();
    x.add("a");
    x.add("b");
    x.add("c");
    x.add("d");

    List<Integer> y = new ArrayList<>();
    y.add(1);
    y.add(2);
    y.add(3);
    y.add(4);

    listPrint(x);
    listPrint(y);

  }


  private static void listPrint(List<?> list) {
    for (Object aList : list) {
      System.out.println(aList);
    }
  }

}
