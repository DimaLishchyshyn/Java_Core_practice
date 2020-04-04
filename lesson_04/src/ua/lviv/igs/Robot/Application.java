package ua.lviv.igs.Robot;

public class Application {

	public static void main(String[] args) {

		Robot robot = new Robot("Robot");
		System.out.println(robot);

		CoffeRobot coffe = new CoffeRobot("CoffeRobot");
		System.out.println(coffe);

		RobotDancer dancer = new RobotDancer("RobotDancer");
		System.out.println(dancer);

		RobotCoocker coocker = new RobotCoocker("RobotCoocker");
		System.out.println(coocker);

		Object[] a = new Object[4];
		a[0] = new Robot("Robot");
		a[1] = new CoffeRobot("CoffeRobot");
		a[2] = new RobotDancer("RobotDancer");
		a[3] = new RobotCoocker("RobotCoocker");

		System.out.println("Массив");
		for (int i = 0; i < a.length; i++) {

			System.out.println("Array = " + a[i]);
		}

	}
}
