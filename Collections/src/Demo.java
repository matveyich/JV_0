
public class Demo {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.addToMap("key1", 1);
		t1.addToMap("key123", 3434);
		
		System.out.println(t1.map.get("key1"));


	}

}
