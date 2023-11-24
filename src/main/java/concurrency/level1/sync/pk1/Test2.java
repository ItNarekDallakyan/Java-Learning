package concurrency.level1.sync.pk1;

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
  private List<Integer> list1 = new ArrayList<>(2000);
  private List<Integer> list2 = new ArrayList<>(2000);
  final Object lock1 = new Object();
  final Object lock2 = new Object();


  //  public synchronized void addToList1() {
  public void addToList1() {
    synchronized (lock1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      list1.add(random.nextInt(10));
    }
  }

  //  public synchronized void addToList2() {
  public void addToList2() {
    synchronized (lock2) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      list2.add(random.nextInt(10));
    }
  }

  public void work() {
    for (int i = 0; i < 1000; i++) {
      addToList1();
      addToList2();
    }
  }

  public void main() {
    long before = System.currentTimeMillis();
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        work();
      }
    });
    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        work();
      }
    });
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long after = System.currentTimeMillis();

    System.out.println("Program took " + (after - before + " ms to run"));
    System.out.println("List1 : " + list1.size());
    System.out.println("List2 : " + list2.size());
  }


}
