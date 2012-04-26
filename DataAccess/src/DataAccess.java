import java.util.List;

public interface DataAccess {

	void InserEntity(User user);
	List<User> ReadAll();
	
}
