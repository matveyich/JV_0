
public class Test {
	static int count = 1;
	
	private Test() {
		count++;
	}
	
	public static Test createTestObject() throws Exception{
		
		if(count <= 5) { 
			return new Test();
		} 
		
		throw new Exception();
		
	}
}
