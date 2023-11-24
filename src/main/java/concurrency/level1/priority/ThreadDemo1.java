package concurrency.level1.priority;

class ThreadDemo1 extends Thread {
  public void run() {
    System.out.println("Inside run method");
  }

  public static void main(String[] args) {
    ThreadDemo1 t1 = new ThreadDemo1();
    ThreadDemo1 t2 = new ThreadDemo1();
    ThreadDemo1 t3 = new ThreadDemo1();

    System.out.println("t1 thread priority : " + t1.getPriority()); // Default 5
    System.out.println("t2 thread priority : " + t2.getPriority()); // Default 5
    System.out.println("t3 thread priority : " + t3.getPriority()); // Default 5

    t1.setPriority(2);
    t2.setPriority(5);
    t3.setPriority(8);

    // t3.setPriority(21); will throw IllegalArgumentException
    System.out.println("t1 thread priority : " + t1.getPriority());  //2
    System.out.println("t2 thread priority : " + t2.getPriority()); //5
    System.out.println("t3 thread priority : " + t3.getPriority());//8

    // Test thread
    System.out.print(Thread.currentThread().getName());
    System.out.println("Test thread priority : " + Thread.currentThread().getPriority());

    // Test thread priority is set to 10
    Thread.currentThread().setPriority(10);
    System.out.println("Test thread priority : " + Thread.currentThread().getPriority());
  }
} 