package userPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;


public class User implements Serializable{

	private static final long serialVersionUID = 2322611132902241888L;
	
	private int id;
	private String name;
	private String phone;
	private List<String> attributes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}
	
	public User(int id, String name, String phone, List<String> attributes)
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.attributes = attributes;
	}

	public void serialize() throws IOException
	{
		ObjectOutputStream objOut = null;
		
		try {
			FileOutputStream out = new FileOutputStream("C:\\ProjectsData\\data.ser.txt", true);
			objOut = new ObjectOutputStream(out);
			
			objOut.writeObject(this);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			objOut.close();
		}
	}
}
