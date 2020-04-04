package ua.lviv.igs.task_02;

public class Coin {

	public static void throwCoin() {

		int coin = (int) (Math.random() * 2);

		if (coin == 1) {
			System.out.println("Орел");
		} else {
			System.out.println("Рєшка");
		}
	}
}
