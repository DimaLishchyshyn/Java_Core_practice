package ua.iviv.igs.Car;

public class Application {

	

	public static void main(String[] args) {

		Car car = new Car("Ford", "Mondeo", "Red", new Body(100), new Helm(100), new Wheel(100));
		System.out.println(car);

	}

}
