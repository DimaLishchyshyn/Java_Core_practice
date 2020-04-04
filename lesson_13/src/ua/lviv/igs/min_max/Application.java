package ua.lviv.igs.min_max;

import java.util.Scanner;

public class Application {
	static void menu() {
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
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				SupremeCouncil.getInstance().addFaction();
				break;
			}
			
			case 2: {
				SupremeCouncil.getInstance().removeFaction();
				break;
			}
			
			case 3: {
				SupremeCouncil.getInstance().getAllFaction();
				break;
			}
			
			case 4: {
				SupremeCouncil.getInstance().clearFaction();
				break;
			}
			
			case 5: {
				SupremeCouncil.getInstance().getFaction();
				break;
			}
			
			case 6: {
				SupremeCouncil.getInstance().addDeputyToFaction();
				break;
			}
			
			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromFaction();
				break;
			}
			
			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromFaction();
				break;
			}
			
			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromFaction();
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
