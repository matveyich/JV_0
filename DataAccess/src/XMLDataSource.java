import java.util.ArrayList;
import java.util.List;


public class XMLDataSource implements DataAccess{

	static User[] users = new User[20];
	
	@Override
	public void InserEntity(User user) {
		users[0] = user; 
		
	}

	@Override
	public List<User> ReadAll() {
		List<User> list = new ArrayList<User>();
		for (User user: users){
			list.add(user);
		}
		return list;
	}

}
