package concurrency.level1.other;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Thread main started");
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new MyTask2());
		executorService.execute(new MyTask2());
		executorService.execute(new MyTask2());
		executorService.execute(new MyTask2());
		executorService.execute(new MyTask2());
		
		executorService.shutdown();
		
		System.out.println("Thread main finished");
	}
}

class MyTask2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}