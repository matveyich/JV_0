
public class Milk extends DrinkDecorator {

	Drink drink;	
	
	public Milk(Drink drink) {
		this.drink = drink;
		this.drinkCost = 2;
		this.description = "Milk";
	}
	
	@Override
	public int cost() {
		return drink.cost() + this.drinkCost;
	}
	
	public String getDescription() {
		return drink.getDescription() + " " + this.description;
	}

}
