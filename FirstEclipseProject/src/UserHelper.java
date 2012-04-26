
public class UserHelper {
	
	public String getFIO(User user){
		String fio = user.getName() + " " + user.getSurname();
		return fio;
	}
	
	public String getInfo(User user){
		String info = "Id: " + user.getId() + "; FIO: " + this.getFIO(user) + "; Age: " + user.getAge();
		return info;
	}
	
}
