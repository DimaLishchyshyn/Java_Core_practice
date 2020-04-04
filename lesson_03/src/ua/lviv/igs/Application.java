package ua.lviv.igs;

public class Application {
	public static void main(String[] args) {

		Ractangle r1 = new Ractangle();
		r1.setA(7);
		r1.setB(9);
		

		Ractangle r2 = new Ractangle(15, 10);

		System.out.println(r1);
		System.out.println(r2);

		Circle c1 = new Circle();
		c1.setR(9);

		Circle c2 = new Circle(7);
		
		System.out.println(c1);
		System.out.println(c2);

	}
}
