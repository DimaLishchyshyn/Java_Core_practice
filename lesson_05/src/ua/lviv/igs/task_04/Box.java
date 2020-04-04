package ua.lviv.igs.task_04;

public class Box {

	int a, b, c;

	public Box(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public Box(int a, int b, int c) {

		this(a, b);
		this.c = c;

	}

}
