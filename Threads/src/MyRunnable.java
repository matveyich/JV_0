
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Test();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void Test() throws InterruptedException
	{
		System.out.println("Thread entered: " + Thread.currentThread().getId());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(10);
			//System.out.println("Thread: " + Thread.currentThread().getId() + "; " + i);
		}
		System.out.println("Thread exited: " + Thread.currentThread().getId());
	}

	
}
