package ua.lviv.igs.task_03;

public class Application {
	public static void main(String[] agrs) {
		
		Printable print = mes -> System.out.println(mes);
		
		print.print("Float �������� ����� = " + Float.MIN_VALUE);
		print.print("Float �������� ����� = " + Float.MAX_VALUE);
		print.print("Double �������� ����� = " + Double.MIN_VALUE);
		print.print("Double �������� ����� = " + Double.MAX_VALUE);
		
		
	}
}
interface Printable {
	void print(String number);
}
