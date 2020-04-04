package ua.lviv.igs;

public class Ractangle {

	private int a;
	private int b;

	Ractangle() {

	}

	Ractangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "Площа прямокутника = " + a * b + ". Периметр прямокутника = " + 2 * (a + b) + " довжина " + a
				+ " ширина " + b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
