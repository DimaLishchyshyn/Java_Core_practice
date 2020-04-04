package ua.lviv.igs.Animal;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("Леопард", 20, 7);
		System.out.println(animal);
		animal.setAnimalName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);

	}

}
