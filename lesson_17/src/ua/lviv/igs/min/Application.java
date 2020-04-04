package ua.lviv.igs.min;

import java.util.Arrays;

import ua.lviv.igs.min.Iterator.Collection;

public class Application {

	public static void main(String[] args) {

		Integer[] array = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Collection col = new Collection(array);

		System.out.println("Початок чисел");
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("Виведення значення масиву від першого до останнього");

		Iterator itForward = col.createForward();

		while (itForward.hasNext()) {
			Integer next = itForward.next();
			System.out.println((next % 2 == 0) ? next : 0);
		}
		System.out.println();
		System.out.println("Виведення значення масиву від останього до першого через 1");

		Iterator itBackward = col.createBackward();

		while (itBackward.hasNext()) {
			System.out.println(itBackward.next());

		}

	}

}
