package ua.lviv.igs.Maximum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Commodity> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {

				Methods.addCommodity();
				break;
			}

			case 4: {
				Methods.sortName();
				break;
			}
			case 5: {
				Methods.sortLength();
				break;
			}
			case 6: {
				Methods.sortWidth();
				break;
			}
			case 7: {
				Methods.sortWeaght();
				break;
			}
			}
		}

	}

	static void menu() {
		System.out.println("1. ������ �����");
		System.out.println("2. �������� �����");
		System.out.println("3. ������� �����");
		System.out.println("4. ��������� �� ������");
		System.out.println("5. ��������� �� ��������");
		System.out.println("6. ��������� �� �������");
		System.out.println("7. ��������� �� �����");
		System.out.println("8. �������� �-��� ������� ��������");
		System.out.println("9. ����� � ��������");

	}

}
