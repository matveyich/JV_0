
public class FirstVisualElement implements Observer, VisualElements {


	Observable dataFactory;
	float fdata;
	float sdata;
	String desc;
	
	public FirstVisualElement(Observable object, String desc) {
		this.dataFactory = object;
		this.dataFactory.registerObserver(this);
		this.desc = desc;
	}
	
	public void display() {
		System.out.println("------- Data Factory: " + this.desc + "-------\nFdata: " + this.fdata + "; Sdata: " + this.sdata + "\n");

	}


	public void update(float fdata, float sdata) {
		this.fdata = fdata;
		this.sdata = sdata;
		display();
	}

}
