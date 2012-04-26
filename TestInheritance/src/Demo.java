
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("\nA a = new A()");
		//A a = new A();
		System.out.println("\nA b = new B()");
		A b = new B();
		System.out.println("\nA c = new C()");
		A c = new C();
		System.out.println("\nB d = new C()");
		B d = new C();
		
		
		//a.meth();
		b.meth();
		c.meth();
		d.meth();

	}

}
