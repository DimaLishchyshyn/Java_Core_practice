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
		System.out.println("������ �����:");

		double number = scan.nextDouble();

		if (number % 1 == 0) {

			if (number % 2 == 0) {
				System.out.println("�����:" + number + " ��������� ������.");

			} else {
				System.out.println("�����:" + number + " �� ��������� ������.");
			}
		} else {
			System.out.println("�����:" + number + " �� ��������� �����.");
		}

	}
	
	public static void SumNumbers() {
		System.out.println("----------------------");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ����� �����:");

		int a = scan.nextInt();
		System.out.println("������ ����� �����:");
		int b = scan.nextInt();
		System.out.println("���� ����� ��������� = "+(a+b));
		
	}

}
