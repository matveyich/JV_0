import java.util.*;


public class Test {

	List<String> demo = new ArrayList<String>();
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	Map<String, ConnectionString> strings = new HashMap<String, ConnectionString>();
	
	Set<Integer> setMap = new HashSet<Integer>();
	
	Queue<Integer> queue = new LinkedList<Integer>();
	
	void addToQueue(int value){
		queue.offer(value);
	}
	
	void addToSet(int value)
	{
		setMap.add(value);
	}
		
	void add(String data)
	{
		demo.add(data);
	}
	
	void addToMap(String key, int value)
	{
		map.put(key, value);
	}
	
	void addConStr(ConnectionString conString, String conName){
		strings.put(conName, conString);
	}
}
