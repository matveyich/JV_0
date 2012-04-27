
public class OurException extends Exception {

	private String msg = "Error, check data in table";
	
	public String getMessage() {
		return this.msg;
	}
	
}
