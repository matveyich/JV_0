import java.util.List;


public class Demo {

	public static void main(String[] args) {
		
		User u1 = new User(1, "Vasya", "Pupkin");
		User u2 = new User(2, "Vasya2", "Pupkin");
		
		DataFactory fabric = new DataFactory();
		
		DataAccess src = fabric.getDataSource("XML");
		
		src.InserEntity(u1);
		src.InserEntity(u2);
		List<User> all = src.ReadAll();
		
		for (User user: all) {
			System.out.println(user.name);
		}
		
	}

}