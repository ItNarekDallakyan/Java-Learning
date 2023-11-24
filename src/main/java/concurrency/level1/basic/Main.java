package concurrency.level1.basic;

public class Main {

    public static void main(String[] args) {

       /* MyThread myThread = new MyThread();
        myThread.start();

        MyThread thread2 = new MyThread();
        thread2.start();*/

        try {
            System.out.println("I am going to sleep");
            Thread.sleep(0b101110111000);
            System.out.println("I am waked up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       // System.out.println("Hello form main thread");


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from myThread" + i);
        }
    }
}