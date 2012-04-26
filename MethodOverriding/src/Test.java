
public class Test extends Base{

	@Override
	String newOverridingMethod(String test) {

		return b;
	}
	
	String newOverridingMethod() {

		return super.newOverridingMethod("test");
	}
		
	public void printLine(int value) {
		System.out.println("Hello  " + value);
	}
	
	public void printLine(double value) {
		System.out.println("Hello  " + value);
	}
	
}
