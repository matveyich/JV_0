
public class Demo {

	public static void main(String[] args) {

		DuckInterface duck = new ADuck();
		ICat cat = new Cat();
		ICat toyCat = new ToyCat();
		
		DuckInterface catLikeADuck = new DuckAdapter(cat);
		DuckInterface toyCatLikeADuck = new DuckAdapter(toyCat);
		
		catLikeADuck.quack();
		toyCatLikeADuck.quack();
		

	}

}
