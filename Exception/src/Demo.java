
public class Demo {

	public static void main(String[] args) {

		try {
		ExceptionRunner run = new ExceptionRunner();
		
		
			run.getData();	
		} 
//		catch(RuntimeException ex)
//		{
//			System.out.println("RuntimeException msg: " + ex.getMessage().toString());	
//		} 
		catch(Exception ex)
		{
			System.out.println("Other Exception msg: " + ex.getStackTrace()+ex.getMessage());
		}
		

	}

}
