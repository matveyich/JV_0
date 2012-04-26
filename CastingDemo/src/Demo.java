
public class Demo {


	public static void main(String[] args) {

		Base b1 = new Base();
		b1.printMethod();
		
		Child c1 = new Child();
		c1.printMethod();
		
		Base b2 = (Base)c1;
		b2.printMethod();
		
	}

}
