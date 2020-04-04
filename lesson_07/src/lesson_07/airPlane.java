package lesson_07;

public abstract class airPlane implements Info {

	int width;
	int length;
	int weight;
	int time = (int) (Math.random() * ((88 - 20) + 1)) + 20;
	double km = (double) (Math.random() * ((1000 - 0) + 1)) + 0;

	public airPlane(int weight, int width, int length) {
		super();
		this.width = width;
		this.length = length;
		this.weight = weight;
	}

	public void startMotors() {
		System.out.println("Готовність до зльоту відбудеться через " + time + "хв.");
	}

	public void takeoffAirplane() {
		System.out.println("Кількість кілометрів як залишилася у літака " + km + "км.");
	}

	public void landingAirplane() {
		System.out.println("Літак іде на посадку");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeaght() {
		return weight;
	}

	public void setWeaght(int weaght) {
		this.weight = weaght;
	}

	@Override
	public String toString() {
		return " Вага = " + weight + "кг. Довжина = " + width + "м. Ширина = " + length + "м";
	}

}
