
public class Demo {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main thread: " + i);
		}

	}

}
