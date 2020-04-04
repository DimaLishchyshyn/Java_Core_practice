package ua.lviv.igs.task_01;

public class Application {
	public static void main(String[] args) {

		Cow cow = new Cow("Cow");
		Cat cat = new Cat("Cat");
		Dog dog = new Dog("Dog");

		cat.voice();
		dog.voice();
		cow.voice();

	}

}
