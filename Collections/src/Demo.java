import java.util.Iterator;
import java.util.Map.Entry;


public class Demo {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.addToMap("key1", 1);
		t1.addToMap("key123", 3434);
		
		Iterator<Entry<String, Integer>> iter = t1.map.entrySet().iterator();
		while (iter.hasNext()){
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		t1.addToSet(22);	//1
		t1.addToSet(6666);	//2
		t1.addToSet(22323);	//3
		t1.addToSet(4545);	//4
		t1.addToSet(22);	//5
		
		System.out.println("\nSET size = " + t1.setMap.size());
		
		for (int i: t1.setMap){
			System.out.println(i);
		}
		
		t1.addToQueue(66);
		t1.addToQueue(32);
		t1.addToQueue(66);

		System.out.println("\nQueue");
		
		while (t1.queue.peek()!=null) {
			System.out.println("element: " + t1.queue.poll());
			System.out.println("size: " + t1.queue.size());
		}
	}

}
