package lesson_07;

public class airplaneControl {

	int km = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km1 = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km2 = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km3 = (int) (Math.random() * ((500 - 1) + 1)) + 1;

	void moveUp() {
		System.out.println("����� " + km + "��.");
	}

	void moveDown() {
		System.out.println("���� " + km1 + "��.");
	}

	void moveLeft() {
		System.out.println("���� " + km2 + "��.");
	}

	void moveRight() {
		System.out.println("������ " + km3 + "��.");
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}
