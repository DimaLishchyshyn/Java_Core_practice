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
		System.out.println("1. Додати товар");
		System.out.println("2. Видалити товар");
		System.out.println("3. Замінити товар");
		System.out.println("4. Сортувати за назвою");
		System.out.println("5. Сортувати за довжиною");
		System.out.println("6. Сортувати за шириною");
		System.out.println("7. Сортувати за вагою");
		System.out.println("8. Виводимо і-тий елемент колекції");
		System.out.println("9. Вийти з програми");

	}

}
