package concurrency.level1.volotile;


public class Test {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();

    /*Scanner in = new Scanner(System.in);
    in.nextLine();

    myThread.shutdown();*/


  }
}

class MyThread extends Thread {

  private  boolean running = true;

  @Override
  public void run() {
//    while (running) {
    while (true) {
      System.out.println("Hello");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void shutdown() {
    this.running = false;
  }
}
