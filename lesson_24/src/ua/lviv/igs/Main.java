package ua.lviv.igs;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) throws TimeException {

		
		Supplier<Integer> menu = () -> {

			System.out.println();
			System.out.println("1 -> �������� ���������");
			System.out.println("2 -> �������� ���������");
			System.out.println("3 -> ������� �� ��������� �� �������");
			System.out.println("4 -> �������� �����");
			System.out.println("5 -> �������� �����");
			System.out.println("6 -> ������� �� ���������� ������ �� ������������ ����");
			System.out.println("7 -> ���������� ��� ������� �� �������� ���������");
			System.out.println("8 -> ����� � ���������");

			
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int menuChoise = sc.nextInt();

			return menuChoise;
		};

		while (true) {
			switch (menu.get()) {
				
			case 1: {
				Cinema.addMovie();
				break;
			}

			case 2: {
				Cinema.removeMovie();
				break;
			}

			case 3: {
				Cinema.allMovies();
				break;
			}

			case 4: {
				Schedule.addSeance();
				break;
			}

			case 5: {
				break;
			}

			case 6: {
				break;
			}

			case 7: {
				break;
			}

			case 8: {
				System.exit(0);
				break;
			}
			}
		}

	}

}
