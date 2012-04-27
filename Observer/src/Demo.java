
public class Demo {

	public static void main(String[] args) {
		
		DataStation da = new DataStation();
		
		FirstVisualElement f1 = new FirstVisualElement(da, "Visual 1");
		FirstVisualElement f2 = new FirstVisualElement(da, "Visual 2");

		da.setData(2, 4);
		da.setData(2345, 55);
		
	}

}
