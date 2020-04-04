package ua.lviv.igs;

public class Circle {

	private int r;
	private double pi = 3.14;

	Circle() {

	}

	Circle(int r) {
		this.r = r;

	}

	public String toString() {
		return "Площа кола = " + pi * (r * r) + ". Довжина кола = "+ pi *2 *r+" радиус = " + r + " діаметр = " + r * 2;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
