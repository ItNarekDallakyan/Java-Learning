package concurrency.level1.sync.pk00;

public class Test {
  private int counter;

  public static void main(String[] args) {

    Test test = new Test();
    test.doWork();

  }

/*  private synchronized void increment() {
    counter++;
  }*/

  private void doWork() {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          counter++;
//          increment();
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          counter++;
//          increment();
        }
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

    System.out.println(counter);
  }


}
