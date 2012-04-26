
public abstract class Drink {
	protected String description;
	protected int drinkCost;
	
	public String getDescription(){
		return description;
	}
	
	public abstract int cost();

}
