
public class User {
	private String name;
	private String surname;
	private int age;
	private int id;
	
	public User(String name, String surname, int age, int id){
		
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setId(id);
		
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	
}