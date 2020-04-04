package ua.lviv.igs.Animal;

public class Animal {
	
	private String animalName;
	private int speed;
	private int age;
	public Animal(String animalName, int speed, int age) {
		super();
		this.animalName = animalName;
		this.speed = speed;
		this.age = age;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Назва тварини = " + animalName + ". Швидкість тварини = " + speed + " км/год. Вік тварини = " + age + " років";
	}
	
	

}
