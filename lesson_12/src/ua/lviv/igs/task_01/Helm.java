package ua.lviv.igs.task_01;

public class Helm extends Motor {

	private int wheelsDiameter;
	private String materials;

	public Helm(int numbersOfCylinders, int wheelsDiameter, String materials) {
		super(numbersOfCylinders);
		this.wheelsDiameter = wheelsDiameter;
		this.materials = materials;
	}

	public int getWheelsDiameter() {
		return wheelsDiameter;
	}

	public void setWheelsDiameter(int wheelsDiameter) {
		this.wheelsDiameter = wheelsDiameter;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return ", діаметр колеса = " + wheelsDiameter + ", матеріал з якого зроблено кермо = " + materials + "" + super.toString();
	}

}
