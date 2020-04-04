package ua.lviv.igs.task_02;

public class Auto extends Helm{

	private int horsesPower;
	private int year;

	

	public Auto(int numbersOfCylinders, int wheelsDiameter, String materials, int horsesPower, int year) {
		super(numbersOfCylinders, wheelsDiameter, materials);
		this.horsesPower = horsesPower;
		this.year = year;
	}

	public int getHorsesPower() {
		return horsesPower;
	}

	public void setHorsesPower(int horsesPower) {
		this.horsesPower = horsesPower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "јвто: к≥льк≥сть к≥нських сил = " + horsesPower + ", р≥к випуску = " + year + "" 
	+ super.toString() ;
	}

	

}
