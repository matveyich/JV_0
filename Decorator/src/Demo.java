
public class Demo {

	public static void main(String[] args) {

		Drink coffe = new Coffee();
		System.out.println(coffe.cost());
		
		coffe = new Milk(coffe);
		coffe = new Milk(coffe);
		coffe = new Milk(coffe);
		coffe = new Milk(coffe);
		coffe = new Milk(coffe);
		System.out.println(coffe.cost());
		System.out.println(coffe.getDescription());
	}

}
