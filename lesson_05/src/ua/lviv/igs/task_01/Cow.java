package ua.lviv.igs.task_01;

public class Cow extends Pet {

	public Cow(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Cow [toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("ß êîğîâà- Ìóóó-Ìóóó");

	}

}
