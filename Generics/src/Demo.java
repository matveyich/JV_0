
public class Demo {


	public static void main(String[] args) {
		Test<DataTest> dataClass = new Test<DataTest>();
		
		dataClass.data = new DataTest();
			
		System.out.println(dataClass.toString());
		
		dataClass.testMeth(dataClass);
	}

}
