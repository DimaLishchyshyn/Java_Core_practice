package ua.lviv.igs.task_01;

public class Motor {
	
	protected int numbersOfCylinders;

	public Motor(int numbersOfCylinders) {
		super();
		this.numbersOfCylinders = numbersOfCylinders;
	}

	public int getNumbersOfCylinders() {
		return numbersOfCylinders;
	}

	public void setNumbersOfCylinders(int numbersOfCylinders) {
		this.numbersOfCylinders = numbersOfCylinders;
	}

	@Override
	public String toString() {
		return ""
				+ ", ������� ������� = " + numbersOfCylinders;
	}
	
	

}
