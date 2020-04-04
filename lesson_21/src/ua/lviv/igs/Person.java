package ua.lviv.igs;

public class Person {

	@Info(parameters = "Person name")
	private String name;
	@Info(parameters = "Person lastname")
	private String lastname;
	@Info(parameters = "Person age")
	private int age;

	public Person(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}

}
