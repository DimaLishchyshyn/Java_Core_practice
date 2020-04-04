package ua.iviv.igs.Car;

public class Body extends Car {

	public int power;

	public Body(int power) {
		super();
		this.power = power*2;
		

	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String toString() {
		return "" + power +"лс";
	}

}
