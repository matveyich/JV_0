
public class Demo {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		System.out.println(t1.newOverridingMethod("Hello"));
		System.out.println(t1.newOverridingMethod());
		
		Base b1 = new Test();
		System.out.println(b1.newOverridingMethod("Hello"));
	}

}
