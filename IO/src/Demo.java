import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Demo {

	public static void main(String[] args) {
	
		Demo t1 = new Demo();
		
		try {
			t1.putStringToFile("Hello, Vasya!\n");
			System.out.println(t1.getStringFromFile());
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

	void putStringToFile(String str) throws IOException
	{
		FileWriter fileWriter = null;
		BufferedWriter bWriter = null;
		
		try {
			fileWriter = new FileWriter("C:\\ProjectsData\\user.txt", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		bWriter = new BufferedWriter(fileWriter);
		try {
			bWriter.append(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			bWriter.close();
		}
		//bWriter.append(str);
	}
	
	String getStringFromFile() throws IOException
	{
		String str = "";
		FileReader fileReader = null;
		BufferedReader bReader = null;
		String line;
		
		try {
			fileReader = new FileReader("C:\\ProjectsData\\user.txt");
			bReader = new BufferedReader(fileReader);
			
			try {
				while ((line = bReader.readLine()) != null){
					str += line;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			if (bReader!=null){
				bReader.close();
			}
		}
		return str;
	}
	
}
