/**
 * @author ��
 */
public class Hello {

	public static void main(String[] args) {

		UserHelper helper = new UserHelper();
		
		User u1 = new User("Vasya", "Pupkin", 32, 0);
		
		User u2 = new User("Vitya", "Tuser", 22, 1);
		
		u2 = u1;
		
		System.out.println(helper.getFIO(u2));
		
		System.out.println(helper.getInfo(u2));
		
	}

}