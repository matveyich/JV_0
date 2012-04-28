import javax.swing.JOptionPane;


public class WorkerThread extends Thread{

	public void run()
	{
		try {
			showDialog();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void showDialog() throws InterruptedException{

		Thread.sleep(10000);
		JOptionPane.showMessageDialog(null, "Test2");
	}
}
