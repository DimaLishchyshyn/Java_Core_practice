package ua.lviv.igs;

import java.util.Scanner;
import java.util.function.Supplier;

public class Application {
	public static void main(String[] args) {
		Supplier<Integer> menu = () -> {
			System.out.println();
			System.out.println("������� 1, ����� �������� ������� � ��������� ����");
			System.out.println("������� 2, ����� ������� ������� �� ��������� ����");
			System.out.println("������� 3, ����� ������� ��� ������� � ��������� ����");
			System.out.println("������� 4, ����� �������� ��������� �������");
			System.out.println("������� 5, ����� ������� ��������� �������");
			System.out.println("������� 6, ����� �������� �������� � �������");
			System.out.println("������� 7, ����� ������� �������� �� �������");
			System.out.println("������� 8, ����� ������� ������ �����������");
			System.out.println("������� 9, ����� ������� ������ �������� ����������");

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int menuChoise = scanner.nextInt();
			
			return menuChoise;
		};

		while (true) {
			switch (menu.get()) {

			case 1: {
				SupremeCouncil.getInstance().addDeputyGroup();
				break;
			}

			case 2: {
				SupremeCouncil.getInstance().removeDeputyGroup();
				break;
			}

			case 3: {
				SupremeCouncil.getInstance().getAllDeputyGroups();
				break;
			}

			case 4: {
				SupremeCouncil.getInstance().clearDeputyGroup();
				break;
			}

			case 5: {
				SupremeCouncil.getInstance().getDeputyGroup();
				break;
			}

			case 6: {
				SupremeCouncil.getInstance().addDeputyToDeputyGroup();
				break;
			}

			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromDeputyGroup();
				break;
			}

			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromDeputyGroup();
				break;
			}

			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromDeputyGroup();
				break;
			}

			default: {
				System.out.println("������� ����� �� 1 �� 9!");
				break;
			}
			}
		}
	}
}
