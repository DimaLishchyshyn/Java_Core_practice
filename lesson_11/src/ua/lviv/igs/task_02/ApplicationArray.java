package ua.lviv.igs.task_02;

import java.util.Arrays;
import java.util.Random;

public class ApplicationArray {

	public static void main(String[] args) {
		
		Auto [][] arrayAuto = {{new Auto(getRandom(2,8), getRandom(200,250), getRandomMaterial(), getRandom(50,500), getRandom(1990,2019))},
								{new Auto(getRandom(2,8), getRandom(200,250), getRandomMaterial(), getRandom(50,500), getRandom(1990,2019))}};
		
		System.out.println(Arrays.deepToString(arrayAuto));
		
	}
	
	public static int getRandom(int min, int max) {
		
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static String getRandomMaterial() {
		String material;
		int choice = (int) (Math.random() * 2) + 1;
		if (choice == 1) {
			material = "Шкіра";
		} else {
			material = "Алькантара";
		}
		return material;
	}

}
