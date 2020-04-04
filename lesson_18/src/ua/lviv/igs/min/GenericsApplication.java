package ua.lviv.igs.min;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsApplication {

	public static void main(String[] args) {

		Generics<Integer, List<Integer>> ob1 = new Generics<>(999,
				new ArrayList<Integer>(Arrays.asList(new Integer("999"))));

		System.out.println(ob1);
		System.out.println("В List<Integer> можна додати об’єкт типу String, "
				+ "но так як стоїть тип Integer, нічого окрім цифер система не бачить.");

	}

}
