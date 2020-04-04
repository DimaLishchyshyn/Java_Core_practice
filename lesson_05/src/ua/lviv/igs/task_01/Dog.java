package ua.lviv.igs.task_01;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);

	}

	@Override
	public String toString() {
		return "Dog [toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("ί οερ- Γΰσσσ-Γΰσσσ");

	}

}
