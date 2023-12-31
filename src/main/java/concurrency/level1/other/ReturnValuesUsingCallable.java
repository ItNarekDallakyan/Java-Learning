package concurrency.level1.other;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ReturnValuesUsingCallable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Thread main started");
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<Future<Integer>> returnedValues = executorService.invokeAll(Arrays.asList(
				new SumFirstNumbers(50), 
				new SumFirstNumbers(40),
				new SumFirstNumbers(30),
				new SumFirstNumbers(20),
				new SumFirstNumbers(10)));
		
		for (Future<Integer> value : returnedValues) {
			System.out.println(value.get());
		}
		
		executorService.shutdown();
		
		System.out.println("Thread main finished");
	}
}

class SumFirstNumbers implements Callable<Integer> {
	private int n;
	
	public SumFirstNumbers(int n) {
		this.n = n;
	}
	
	public Integer call() {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
			sum += i;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}
