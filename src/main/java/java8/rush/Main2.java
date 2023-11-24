package java8.rush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    List<Integer> list = new ArrayList<>();

    fillArr(arr);
    fillList(list);
    System.out.println(list);
    System.out.println(Arrays.toString(arr));


  /*  for (int i = 0; i < 10; i++) {
      arr[i] = arr[i] * 2;
      list.set(i, list.get(i) * 2);
    }*/

   /* arr = Arrays.stream(arr).map(a -> a * 2).toArray();
    list = list.stream().map(a -> a * 2).collect(Collectors.toList());*/


//    arr = Arrays.stream(arr).map(a -> 3).toArray();//lcnum em 3 ner
//    arr = Arrays.stream(arr).map(a -> a + 1).toArray();//lcnum a 4 verevi 3@ petqa


  /*  arr = Arrays.stream(arr).filter(a -> a % 2 == 0).toArray();
    list = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());*/

    Arrays.stream(arr).forEach(System.out::println);
    list.forEach(System.out::println);

    System.out.println(list);
    System.out.println(Arrays.toString(arr));


  }

  private static void fillList(List<Integer> list) {
    for (int i = 0; i < 10; i++) {
      list.add(i + 1);
    }
  }

  private static void fillArr(int[] arr) {
    for (int i = 0; i < 10; i++) {
      arr[i] = i + 1;
    }


  }
}
