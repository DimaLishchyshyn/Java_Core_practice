package ua.lviv.igs.task_02_and_03;

import java.util.Scanner;

public class Application {

	public static void main(String[] agrs) {
		Numbers();
		SumNumbers();
		
	}

	public static void Numbers() {


		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть число:");

		double number = scan.nextDouble();

		if (number % 1 == 0) {

			if (number % 2 == 0) {
				System.out.println("Число:" + number + " являється парним.");

			} else {
				System.out.println("Число:" + number + " не являється парним.");
			}
		} else {
			System.out.println("Число:" + number + " не являється цілим.");
		}

	}
	
	public static void SumNumbers() {
		System.out.println("----------------------");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть перше число:");

		int a = scan.nextInt();
		System.out.println("Введіть друге число:");
		int b = scan.nextInt();
		System.out.println("Сума чисел становить = "+(a+b));
		
	}

}
