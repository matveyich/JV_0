
public class Base {

	public int a = 5;
	public String b = "Name";
	protected String c = "Surname";
	private String d = "Third name";
	
	String newOverridingMethod(String test){
		
		return b + " " + c;
	}
	
}
