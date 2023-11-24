package concurrency.level1.sync.pk0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {

  public static void main(String[] args) {

    Worker worker = new Worker();
    worker.main();

  }
}

class Worker {
  Random random = new Random();
  private List<Integer> list1 = new ArrayList<>();
  private List<Integer> list2 = new ArrayList<>();


  public void addToList1() {

    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    list1.add(random.nextInt(10));

  }

  public void addToList2() {
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    list2.add(random.nextInt(10));

  }

  public void work() {
    for (int i = 0; i < 1000; i++) {
      addToList1();
      addToList2();
    }
  }

  public void main() {
    long before = System.currentTimeMillis();
    work();
    long after = System.currentTimeMillis();

    System.out.println("Program took " + (after - before + " ms to run"));
    System.out.println("List1 : " + list1.size());
    System.out.println("List2 : " + list2.size());
  }


}
