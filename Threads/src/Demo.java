import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Demo {

	public static void main(String[] args) {

		Runnable run = new MyRunnable();
		Thread thread2 = new Thread(run);

		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		executor.submit(thread2);
		executor.submit(thread2);
		executor.submit(thread2);
		
		executor.submit(thread2);
		executor.submit(thread2);
		executor.submit(thread2);
		
		executor.shutdown();
		
//		for (int i = 0; i < 100; i++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Main thread: " + i);
//		}

	}

}
