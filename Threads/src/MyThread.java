
public class MyThread extends Thread{
	public void run()
	{
		this.Cycle();
	}
	
	public void Cycle() 
	{
		for (int i = 0; i < 100; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Second Thread: " + i);
		}
	}
}
