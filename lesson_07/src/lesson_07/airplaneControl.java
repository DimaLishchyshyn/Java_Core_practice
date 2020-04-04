package lesson_07;

public class airplaneControl {

	int km = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km1 = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km2 = (int) (Math.random() * ((500 - 1) + 1)) + 1;
	int km3 = (int) (Math.random() * ((500 - 1) + 1)) + 1;

	void moveUp() {
		System.out.println("ββεπυ " + km + "κμ.");
	}

	void moveDown() {
		System.out.println("βνθη " + km1 + "κμ.");
	}

	void moveLeft() {
		System.out.println("βλ³βξ " + km2 + "κμ.");
	}

	void moveRight() {
		System.out.println("βοπΰβξ " + km3 + "κμ.");
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}
