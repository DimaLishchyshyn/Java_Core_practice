package ua.lviv.igs.task_01;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);

	}

	@Override
	public String toString() {
		return "Cat [toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");

	}

}
