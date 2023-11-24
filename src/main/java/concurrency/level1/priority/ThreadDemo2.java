package concurrency.level1.priority;
// Java program to demonstrat ethat a child thread
// gets same priority as parent 

class ThreadDemo2 extends Thread {
  public void run() {
    System.out.println("Inside run method");
  }

  public static void main(String[] args) {
    // main thread priority is 6 now
    Thread.currentThread().setPriority(6);

    System.out.println("main thread priority : " + Thread.currentThread().getPriority());

    ThreadDemo2 t1 = new ThreadDemo2();

    // t1 thread is child of main thread
    // so t1 thread will also have priority 6.
    System.out.println("t1 thread priority : " + t1.getPriority());
  }
} 