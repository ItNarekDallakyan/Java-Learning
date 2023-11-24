package generics.training.wildcards.pkg1;
//Java program to demonstrate Lower Bounded Wildcards 

import java.util.Arrays;
import java.util.List;

class WildcardDemo {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

    printOnlyIntegerClassorSuperClass(list1);

    List<Number> list2 = Arrays.asList(4, 5, 6, 7);

    printOnlyIntegerClassorSuperClass(list2);
  }

  private static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
    System.out.println(list);
  }
} 