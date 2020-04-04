package lesson_07;

public class Cy_27 extends airPlane {

	int number = (int) (Math.random() * ((10 - 1) + 1)) + 1;
	int time = (int) (Math.random() * ((50 - 20) + 1)) + 20;
	int speed = (int) (Math.random() * ((950 - 820) + 1)) + 820;
	int maxSpeed;
	String color;
	airplaneControl airplaneControl = new airplaneControl();

	public Cy_27(int weight, int width, int length, int maxSpeed, String color) {
		super(weight, width, length);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void TurboAcceleration() {
		int speed = getSpeed() + 400;
		setSpeed(speed);
		System.out.println("Включаємо турбоприскорення " + speed + "км/час");
	}

	@Override
	public void StealthTechnology() {
		System.out.println("Літак не видно напротязі " + time + " хв.");

	}

	@Override
	public void NuclearStrike() {
		System.out.println("Кількість ядерних боєоловок яку буде скинуто " + number + " шт.");

	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Літак Cy-27" + super.toString() + ". Максемальна швидкість = " + maxSpeed + "км/час, колір = " + color;
	}

	public void moveUp(int km) {
		airplaneControl.moveUp();
	}

	public void moveDown(int km) {
		airplaneControl.moveDown();
	}

	public void moveLeft(int km) {
		airplaneControl.moveLeft();
	}

	public void moveRight(int km) {
		airplaneControl.moveRight();
	}

}
