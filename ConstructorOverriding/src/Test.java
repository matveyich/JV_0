
public class Test extends Base{
	int x;
	int y;
	
	public Test(){
		super(5);
		System.out.println("Test constructor");
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ";" + this.y + ")";
	}
	
}
