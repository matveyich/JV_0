
public class Demo {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		Runnable run = new MyRunnable();
		Thread thread2 = new Thread(run);
		
		thread2.start();
		thread.start();
		
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread: " + i);
		}

	}

}
