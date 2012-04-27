
public class Test <T extends IDataTest>{
	
	T data;
	
	T myMeth(T value){
		return null;
	}
	
	
	public String toString() {
	
		data.testBoundedGenerics();
		return "true";
	}
	
	<U> void testMeth(U value){
		System.out.println(value.getClass().toString());
	}

}
