import java.util.*;


public class Test {

	List<String> demo = new ArrayList<String>();
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	void add(String data)
	{
		demo.add(data);
	}
	
	void addToMap(String key, int value)
	{
		map.put(key, value);
	}
}
