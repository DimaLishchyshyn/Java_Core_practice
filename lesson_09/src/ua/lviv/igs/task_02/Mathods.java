package ua.lviv.igs.task_02;

public class Mathods {

	public static void main(String[] args) throws Exception {

		int a = 1;
		int b = 1;
		System.out.println("a = "+a+ " and b = "+ b);

		if (a < 0 & b < 0) {
			throw new IllegalArgumentException("a<0 Г b<0");
		} else if (a == 0 & b != 0 || a != 0 & b == 0) {
			throw new ArithmeticException("a=0 Г b!=0 рсю a!=0 Г b=0");
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException("a=0 Г b=0");
		}else if (a>0 & b>0) {
			Plus(a, b);
			Minus(a, b);
			Multiply(a, b);
			Divide(a, b);
			throw new MyException("Good!!!");
		}

	}

	static void Plus(int a, int b) {
		System.out.println("a + b = " + (a + b));
	}

	static void Minus(int a, int b) {
		System.out.println("a - b = " + (a - b));
	}

	static void Multiply(int a, int b) {
		System.out.println("a * b = " + (a * b));
	}

	static void Divide(int a, int b) {
		System.out.println("a / b = " + (a / b));
	}

}
