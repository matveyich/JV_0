import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import serializePackage.User;


public class Demo {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> attr = new ArrayList<String>();
		attr.add("some test data");
		
		
		User u1 = new User(1, "Vasya", "23452345", attr);
		User u2 = new User(2, "Petya", "7798797", attr);
		User u3 = new User(3, "Kolya", "64999879", attr);
		
		ObjectOutputStream objOut = null;
		
		try {
			FileOutputStream out = new FileOutputStream("C:\\ProjectsData\\data.ser.txt");
			objOut = new ObjectOutputStream(out);
			
			objOut.writeObject(u1);
			objOut.writeObject(u2);
			objOut.writeObject(u3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			objOut.close();
		}
	}

}
