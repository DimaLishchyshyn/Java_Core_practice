package ua.lviv.igs.task_03;

public class Application {
	public static void main(String[] agrs) {
		
		Printable print = mes -> System.out.println(mes);
		
		print.print("Float найменше число = " + Float.MIN_VALUE);
		print.print("Float найбільше число = " + Float.MAX_VALUE);
		print.print("Double найменше число = " + Double.MIN_VALUE);
		print.print("Double найбільше число = " + Double.MAX_VALUE);
		
		
	}
}
interface Printable {
	void print(String number);
}
