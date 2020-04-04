package ua.lviv.igs.task_02.interface2;

import ua.lviv.igs.task_02.interface1.Numerable;

public class MyCalculator implements Numerable {

	private int a;
	private int b;
	private int c;

	MyCalculator(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	MyCalculator(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void add() {
		int c = a + b;
		setC(c);

	}

	@Override
	public void sub() {
		int c = a - b;
		setC(c);

	}

	@Override
	public void mult() {
		int c = a * b;
		setC(c);

	}

	@Override
	public void div() {
		int c = a / b;
		setC(c);

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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "a=" + a + ", b=" + b;
	}

	public static void main(String[] agrs) {

		MyCalculator ca = new MyCalculator(40, 13);
		System.out.println(ca);
		ca.add();
		System.out.println("a + b = " + ca.c);
		ca.sub();
		System.out.println("a - b = " + ca.c);
		ca.mult();
		System.out.println("a * b = " + ca.c);
		ca.div();
		System.out.println("a / b = " + ca.c);
	}

}
