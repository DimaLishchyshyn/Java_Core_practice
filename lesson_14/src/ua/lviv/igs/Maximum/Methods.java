package ua.lviv.igs.Maximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Methods {

	static ArrayList<Commodity> arr = new ArrayList<>();

	static void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ������");
		String name = sc.next();
		System.out.println("������ �������");
		int length = sc.nextInt();
		System.out.println("������ ������");
		int width = sc.nextInt();
		System.out.println("������ ����");
		int weaght = sc.nextInt();

		Commodity c = new Commodity(name, length, width, weaght);
		arr.add(c);
		for (Commodity commodity : arr) {
			System.out.println(commodity.toString());
		}

	}

	static void sortName() {
		System.out.println("���������� �� ����");
		Collections.sort(arr, new nameComparator());
		for (Commodity commodity : arr) {

			System.out.println(commodity);
		}
	}

	static void sortLength() {
		System.out.println("���������� �� ������");
		Collections.sort(arr, new lengthComparator());
		for (Commodity commodity : arr) {

			System.out.println(commodity);
		}
	}

	static void sortWeaght() {
		System.out.println("���������� �� ���");
		Collections.sort(arr, new weaghtComparator());
		for (Commodity commodity : arr) {

			System.out.println(commodity);
		}
	}

	static void sortWidth() {
		System.out.println("���������� �� �����");
		Collections.sort(arr, new widthComparator());
		for (Commodity commodity : arr) {

			System.out.println(commodity);
		}
	}

}
