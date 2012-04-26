import java.util.List;
import java.util.ArrayList;


public class SqlDataSource implements DataAccess{


	static List<User> users = new ArrayList<User>();
	
	@Override
	public void InserEntity(User user) {
		users.add(user);
		
	}

	@Override
	public List<User> ReadAll() {
		
		return users;
	}

	
	
}
