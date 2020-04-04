package ua.lviv.igs.task_01;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {

		Integer[] array = { 51, 25, 67, 856, 548, 687, 52, 3, 87, 654, 25, 99, 89, 8, 445, 15 };
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("min " + Arrays.toString(array) + " max");

		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("max " + Arrays.toString(array) + " min");

	}
}
