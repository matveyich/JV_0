
public class DuckAdapter implements DuckInterface {

	ICat catToAdapt;
	
	public DuckAdapter(ICat catToAdapt) {
		this.catToAdapt = catToAdapt;
	}
	
	public void quack() {
		
		catToAdapt.mjao();

	}

}
